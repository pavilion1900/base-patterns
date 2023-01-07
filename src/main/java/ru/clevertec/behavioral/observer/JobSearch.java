package ru.clevertec.behavioral.observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer subscriber1 = new Subscriber("Eugene Suleimanov");
        Observer subscriber2 = new Subscriber("Peter Ramonenko");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Third Java position");
        jobSite.removeVacancy("First Java position");
    }
}
