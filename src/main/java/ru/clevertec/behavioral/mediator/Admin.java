package ru.clevertec.behavioral.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Admin implements User {

    private final Chat chat;

    @Getter
    private final String name;

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.getName() + " receive message: " + message);
    }
}
