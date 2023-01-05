package ru.clevertec.creational.prototype;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project implements Copyable {

    Integer id;
    String projectName;
    String sourceCode;

    @Override
    public Object copy() {
        return new Project(id, projectName, sourceCode);
    }
}
