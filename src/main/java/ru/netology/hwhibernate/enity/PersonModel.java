package ru.netology.hwhibernate.enity;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class PersonModel implements Serializable {
    private String name;
    private String surname;
    private int age;
}