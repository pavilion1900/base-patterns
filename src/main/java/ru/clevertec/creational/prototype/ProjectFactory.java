package ru.clevertec.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProjectFactory {

    private Project project;

    public Project cloneProject() {
        return (Project) project.copy();
    }
}
