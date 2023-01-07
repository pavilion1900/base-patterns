package ru.clevertec.behavioral.mediator;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {

    @Setter
    private User admin;

    private final List<User> users = new ArrayList<>();

    public void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream()
                .filter(element -> element != user)
                .forEach(element -> element.getMessage(message));
        admin.getMessage(message);
    }
}
