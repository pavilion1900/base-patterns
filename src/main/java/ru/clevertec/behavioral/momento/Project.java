package ru.clevertec.behavioral.momento;

import lombok.ToString;

import java.util.Date;

@ToString
public class Project {

    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }
}
