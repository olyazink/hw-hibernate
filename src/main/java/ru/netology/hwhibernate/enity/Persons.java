package ru.netology.hwhibernate.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Entity
@Data
@IdClass(PersonModel.class)
public class Persons {
    @Id
    @Column(nullable = false)
    private String name;
    @Id
    @Column(nullable = false)
    private String surname;
    @Id
    @Column(nullable = false)
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column( name = "city_of_living", nullable = false)
    private String cityOfLiving;

    @Override
    public String toString() {
        return String.format("{%s, %s, %d, %s, %s}",name, surname, age, phoneNumber, cityOfLiving);
    }
}