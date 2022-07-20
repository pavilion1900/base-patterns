package ru.clevertec.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
//        Project project = new RealProject("https://www.github.com/user/project");
        Project project = new ProxyProject("https://www.github.com/user/project");
        project.run();
    }
}
