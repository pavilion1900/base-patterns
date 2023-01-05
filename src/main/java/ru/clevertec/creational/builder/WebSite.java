package ru.clevertec.creational.builder;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WebSite {

    String name;
    Cms cms;
    Integer price;
}
