package ru.clevertec.creational.abstractfactory;

public interface ProjectTeamFactory {

    Developer createDeveloper();

    Tester createTester();

    ProjectManager createProjectManager();
}
