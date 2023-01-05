package ru.clevertec.creational.factory;

public class Example {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryByName("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactoryByName(String name) {
        if (name.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (name.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("There is no factory with name " + name);
        }
    }
}
