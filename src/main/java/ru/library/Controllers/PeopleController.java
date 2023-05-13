package ru.library.Controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.library.DAO.PersonDAO;
import ru.library.entities.Book;
import ru.library.entities.Person;
import ru.library.util.PersonValidator;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDAO;
    private final PersonValidator personValidator;

    @Autowired
    public PeopleController(PersonDAO personDAO, PersonValidator personValidator) {
        this.personDAO = personDAO;
        this.personValidator = personValidator;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("people", personDAO.index());
        return "/people/index";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person")Person person){
        return "/people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult){
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors()){
            return "/people/new";
        }
        personDAO.create(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id, Model model){
        model.addAttribute("person", personDAO.show(id));
        model.addAttribute("books", personDAO.personBooks(id));

        System.out.println(1);
        System.out.println(personDAO.personBooks(id));
        return "/people/show";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id")int id){
        personDAO.delete(id);
        return "redirect:/people";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id")int id, Model model){
        model.addAttribute("person", personDAO.show(id));
        return "/people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable("id")int id,
                         @ModelAttribute("person") @Valid Person person, BindingResult bindingResult){
        person.setPersonId(id);

        if (bindingResult.hasErrors()){
            return "/people/edit";
        }

        personDAO.update(person);
        return "redirect:/people";
    }
}
