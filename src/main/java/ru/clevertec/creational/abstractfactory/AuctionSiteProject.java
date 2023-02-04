package ru.clevertec.creational.abstractfactory;

import ru.clevertec.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteTeamFactory();
        Developer developer = factory.createDeveloper();
        Tester tester = factory.createTester();
        ProjectManager projectManager = factory.createProjectManager();

        System.out.println("Creating auction website");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
