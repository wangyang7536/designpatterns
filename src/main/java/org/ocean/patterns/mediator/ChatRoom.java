package org.ocean.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(User sender, String message) {
        for (User user : users) {
            if (!user.getName().equals(sender.getName())) {
                user.receiveMessage(message);
            }
        }
    }
}
