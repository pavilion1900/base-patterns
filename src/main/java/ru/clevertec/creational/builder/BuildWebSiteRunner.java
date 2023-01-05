package ru.clevertec.creational.builder;

public class BuildWebSiteRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setWebSiteBuilder(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);
    }
}
