package ru.clevertec.creational.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1, "Super project",
                "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();
        System.out.println("--------------");
        System.out.println(masterClone);
    }
}
