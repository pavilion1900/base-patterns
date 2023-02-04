package ru.clevertec.creational.abstractfactory;

import ru.clevertec.creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingTeamFactory();
        Developer developer = factory.createDeveloper();
        Tester tester = factory.createTester();
        ProjectManager projectManager = factory.createProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
