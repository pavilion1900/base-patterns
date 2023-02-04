package ru.clevertec.creational.abstractfactory.website;

import ru.clevertec.creational.abstractfactory.Developer;
import ru.clevertec.creational.abstractfactory.ProjectManager;
import ru.clevertec.creational.abstractfactory.ProjectTeamFactory;
import ru.clevertec.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer createDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new WebsitePM();
    }
}
