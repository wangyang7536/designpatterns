package org.ocean.patterns.dao;

import java.util.*;

public class EntityDao implements Dao<Entity> {
    private Map<Integer, Entity> entityMap = new HashMap<>();

    @Override
    public Optional<Entity> get(int id) {
        return Optional.ofNullable(entityMap.get(id));
    }

    @Override
    public List<Entity> getAll() {
        return new ArrayList<>(entityMap.values());
    }

    @Override
    public void create(Entity entity) {
        entityMap.putIfAbsent(entity.getId(), entity);
    }

    @Override
    public void update(Entity entity) {
        entityMap.put(entity.getId(), entity);
    }

    @Override
    public void delete(Entity entity) {
        entityMap.remove(entity.getId());
    }
}
