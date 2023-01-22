package ru.clevertec.behavioral.iterator;

public class JavaDeveloperRunner {

    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Gradle", "PostgreSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Eugene Suleimanov", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
