package ru.clevertec.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Developer {

    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            log.info("Developer is solving problems");
        } else {
            log.info("Developer is reading Habr");
        }
    }
}
