package ru.clevertec.behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Developer {

    private final Command insert;
    private final Command update;
    private final Command select;
    private final Command delete;

    public void insertRecord() {
        insert.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
