package ru.library.entities;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Person {
    private int id;
    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+ [А-Я][а-я]+",
            message = "Корректный формат ФИО: Фамилия Имя Отчество")
    @Size(max = 100, message = "Слишком длинные ФИО")
    private String initials;
    @Min(value = 1900, message = "Год рождения должен быть после 1900")
    @Size(min = 1, message = "Поле не может быть пустым")
    private int birthYear;

    public Person(int id, String initials, int birthYear) {
        this.id = id;
        this.initials = initials;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
