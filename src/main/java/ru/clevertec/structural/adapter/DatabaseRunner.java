package ru.clevertec.structural.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        DataBase database = new AdapterJavaToDataBase();

        database.insert();
        database.update();
        database.delete();
        database.select();
    }
}
