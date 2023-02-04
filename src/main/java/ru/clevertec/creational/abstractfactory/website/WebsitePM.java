package ru.clevertec.creational.abstractfactory.website;

import ru.clevertec.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
