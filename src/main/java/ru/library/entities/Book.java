package ru.library.entities;

import jakarta.validation.constraints.*;

public class Book {
    private int bookId;

    @NotEmpty(message = "Поле не может быть пустым")
    @Pattern(regexp = "[А-Я].+", message = "Корректный формат названия: Название")
    @Size(max = 100, message = "Слишком длинное название")
    private String name;

    @NotEmpty(message = "Поле не может быть пустым")
    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+", message = "Корректный формат автора: Имя Фамилия")
    @Size(max = 100, message = "Слишком длинные имя и фамилия")
    private String author;

    @NotNull(message = "Поле не может быть пустым")
    @Min(value = 1, message = "Год создания должен быть > 1")
    private int year;

    public Book(int id, String name, String author, int year) {
        this.bookId = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book() {}

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
