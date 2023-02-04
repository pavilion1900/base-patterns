package ru.clevertec.creational.abstractfactory.banking;

import ru.clevertec.creational.abstractfactory.Developer;
import ru.clevertec.creational.abstractfactory.ProjectManager;
import ru.clevertec.creational.abstractfactory.ProjectTeamFactory;
import ru.clevertec.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new BankingPM();
    }
}
