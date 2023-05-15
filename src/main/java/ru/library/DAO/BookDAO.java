package ru.library.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.library.entities.Book;
import ru.library.entities.Person;

import java.util.List;

@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index(){
        return jdbcTemplate.query("SELECT * FROM books", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book show(int id){
        return jdbcTemplate.query("SELECT * FROM books WHERE book_id = ?",
                new BeanPropertyRowMapper<>(Book.class), id).stream().findAny().orElse(null);
    }

    public void create(Book book){
        jdbcTemplate.update("INSERT INTO books(name, author, year) VALUES (?, ?, ?)",
                book.getName(), book.getAuthor(), book.getYear());
    }

    public void update(Book book){
        jdbcTemplate.update("UPDATE books SET name = ?, author = ?, year = ? WHERE book_id = ?",
                book.getName(), book.getAuthor(), book.getYear(), book.getBookId());
    }

    public void delete(int id){
        jdbcTemplate.update("DELETE FROM books WHERE book_id = ?", id);
    }

    public Person owner(int id){
        return jdbcTemplate.query("SELECT people.name FROM people JOIN books " +
                        "ON people.person_id = books.person_id WHERE book_id = ?",
                new BeanPropertyRowMapper<>(Person.class), id).stream().findAny().orElse(null);
    }

    public void free(int id){
        jdbcTemplate.update("UPDATE books SET person_id = null WHERE book_id = ?", id);
    }

    public List<Book> personBooks(int personId){
        return jdbcTemplate.query("SELECT * FROM books WHERE person_id = ?", new BeanPropertyRowMapper<>(Book.class), personId);
    }

    public void assign(int id, Person person){
        jdbcTemplate.update("UPDATE books SET person_id = ? WHERE book_id = ?", person.getPersonId(), id);
    }
}
