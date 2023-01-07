package ru.clevertec.behavioral.observer;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Subscriber implements Observer {

    private final String name;

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:");
        vacancies.forEach(System.out::println);
        System.out.println("========================");
    }
}
