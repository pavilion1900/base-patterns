package ru.clevertec.creational.builder;

public abstract class WebSiteBuilder {

    private WebSite webSite;

    public void createWebSite() {
        webSite = new WebSite();
    }

    public abstract void buildName();

    public abstract void buildCms();

    public abstract void buildPrice();

    public WebSite getWebSite() {
        return webSite;
    }
}
