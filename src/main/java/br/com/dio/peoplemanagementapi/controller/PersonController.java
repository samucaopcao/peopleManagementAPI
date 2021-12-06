package br.com.dio.peoplemanagementapi.controller;

import br.com.dio.peoplemanagementapi.dto.MessageResponseDTO;
import br.com.dio.peoplemanagementapi.entity.Person;
import br.com.dio.peoplemanagementapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {


    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
            return personService.createPerson(person);
    }

}
