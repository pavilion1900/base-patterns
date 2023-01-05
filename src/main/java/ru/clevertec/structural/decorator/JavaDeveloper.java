package ru.clevertec.structural.decorator;

public class JavaDeveloper implements Developer {

    @Override
    public String makeJob() {
        return "write Java code.";
    }
}
