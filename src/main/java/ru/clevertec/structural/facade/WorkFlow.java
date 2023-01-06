package ru.clevertec.structural.facade;

public class WorkFlow {

    private final Developer developer = new Developer();
    private final Job job = new Job();
    private final BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
