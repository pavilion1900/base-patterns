package ru.clevertec.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private static final Map<String, Developer> DEVELOPERS = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = DEVELOPERS.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer");
                    developer = new CppDeveloper();
            }
            DEVELOPERS.put(speciality, developer);
        }
        return developer;
    }
}
