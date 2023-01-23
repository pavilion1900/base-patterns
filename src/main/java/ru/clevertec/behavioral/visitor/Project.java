package ru.clevertec.behavioral.visitor;

import java.util.Arrays;

public class Project implements ProjectElement {

    private ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        Arrays.stream(projectElements)
                .forEach(projectElement -> projectElement.beWritten(developer));
    }
}
