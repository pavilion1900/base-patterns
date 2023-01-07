package ru.clevertec.behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateCommand implements Command {

    private final Database database;

    @Override
    public void execute() {
        database.update();
    }
}
