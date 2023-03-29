package org.ocean.patterns.dao;

import jakarta.persistence.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class JpaEntityDao implements Dao<Entity> {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public JpaEntityDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("my_persistence_unit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Optional<Entity> get(int id) {
        return Optional.ofNullable(entityManager.find(Entity.class, id));
    }

    @Override
    public List<Entity> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Entity e");
        return query.getResultList();
    }

    @Override
    public void create(Entity entity) {
        executeInsideTransaction(entityManager -> entityManager.persist(entity));
    }

    @Override
    public void update(Entity entity) {
        executeInsideTransaction(entityManager -> entityManager.merge(entity));
    }

    @Override
    public void delete(Entity entity) {
        executeInsideTransaction(entityManager -> entityManager.remove(entity));
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}
