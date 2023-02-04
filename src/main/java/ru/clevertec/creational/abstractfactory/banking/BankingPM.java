package ru.clevertec.creational.abstractfactory.banking;

import ru.clevertec.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
