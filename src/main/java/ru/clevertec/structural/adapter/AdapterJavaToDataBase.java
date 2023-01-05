package ru.clevertec.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdapterJavaToDataBase implements DataBase {

    private JavaApplication javaApplication;

    @Override
    public void insert() {
        javaApplication.saveObject();
    }

    @Override
    public void update() {
        javaApplication.updateObject();
    }

    @Override
    public void delete() {
        javaApplication.deleteObject();
    }

    @Override
    public void select() {
        javaApplication.loadObject();
    }
}
