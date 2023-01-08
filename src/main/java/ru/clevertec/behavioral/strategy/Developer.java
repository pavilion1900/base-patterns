package ru.clevertec.behavioral.strategy;

import lombok.Setter;

public class Developer {

    @Setter
    private Activity activity;

    public void executeActivity() {
        activity.justDoIt();
    }
}
