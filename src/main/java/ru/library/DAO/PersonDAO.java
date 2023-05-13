package ru.library.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import ru.library.entities.Person;

import java.util.List;
import java.util.Optional;

@Controller
public class PersonDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index(){
        return jdbcTemplate.query("SELECT * FROM people", new BeanPropertyRowMapper<>(Person.class));
    }

    public void create(Person person){
        jdbcTemplate.update("INSERT INTO people(name, birth_year) VALUES (?, ?)",
                person.getName(), person.getBirthYear());
    }

    public Optional<Person> show(String name){
        return jdbcTemplate.query("SELECT * FROM people WHERE name = ?",
                new BeanPropertyRowMapper<>(Person.class), name).stream().findAny();
    }

    public Person show(int id){
        return jdbcTemplate.query("SELECT * FROM people WHERE person_id = ?",
                new BeanPropertyRowMapper<>(Person.class), id).stream().findAny().orElse(null);
    }

    public void delete(int id){
        jdbcTemplate.update("DELETE FROM people WHERE person_id = ?", id);
    }

    public void update(int id, Person person){
        jdbcTemplate.update("UPDATE people SET name = ?, birth_year = ? WHERE person_id = ?",
                person.getName(), person.getBirthYear(), id);
    }
}
