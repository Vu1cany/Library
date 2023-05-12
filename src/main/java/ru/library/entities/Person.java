package ru.library.entities;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Person {
    private int personId;

    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+ [А-Я][а-я]+",
            message = "Корректный формат ФИО: Фамилия Имя Отчество")
    @Size(max = 100, message = "Слишком длинные ФИО")
    private String name;

    @Min(value = 1900, message = "Год рождения должен быть после 1900")
    private int birthYear;

    public Person(int id, String name, int birthYear) {
        this.personId = id;
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {}

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
