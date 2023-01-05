package ru.clevertec.creational.builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {

    @Override
    public void buildName() {
        getWebSite().setName("Enterprise Web Site");
    }

    @Override
    public void buildCms() {
        getWebSite().setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        getWebSite().setPrice(10_000);
    }
}
