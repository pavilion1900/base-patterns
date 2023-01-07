package ru.clevertec.behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteCommand implements Command {

    private final Database database;

    @Override
    public void execute() {
        database.delete();
    }
}
