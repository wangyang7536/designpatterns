package org.ocean.patterns.mediator;

import org.junit.Test;

public class ChatRoomTest {
    @Test
    public void test() {
        User user1 = new User("Ocean");
        User user2 = new User("Johan");
        User user3 = new User("Lawrence");
        User user4 = new User("Nick");
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);
        chatRoom.sendMessage(user1, "Hello World");
        chatRoom.sendMessage(user2, "Nice Ball");
        chatRoom.sendMessage(user3, "Good Morning");
        chatRoom.sendMessage(user4, "Have a good one");
    }
}
