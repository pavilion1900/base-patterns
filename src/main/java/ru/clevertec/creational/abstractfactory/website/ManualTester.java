package ru.clevertec.creational.abstractfactory.website;

import ru.clevertec.creational.abstractfactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
