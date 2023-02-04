package ru.clevertec.creational.abstractfactory.website;

import ru.clevertec.creational.abstractfactory.Developer;

public class PHPDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
