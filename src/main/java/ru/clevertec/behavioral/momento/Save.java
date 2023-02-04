package ru.clevertec.behavioral.momento;

import lombok.Getter;

import java.util.Date;

@Getter
public class Save {

    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }
}
