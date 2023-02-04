package ru.clevertec.creational.abstractfactory.banking;

import ru.clevertec.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
