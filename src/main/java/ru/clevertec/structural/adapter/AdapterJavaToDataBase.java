package ru.clevertec.structural.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

    @Override
    public void select() {
        loadObject();
    }
}
