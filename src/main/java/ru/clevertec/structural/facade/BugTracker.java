package ru.clevertec.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BugTracker {

    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        log.info("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint() {
        log.info("Sprint is not active");
        activeSprint = false;
    }
}
