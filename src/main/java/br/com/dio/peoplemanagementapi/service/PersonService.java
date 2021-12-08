package br.com.dio.peoplemanagementapi.service;

import br.com.dio.peoplemanagementapi.dto.MessageResponseDTO;
import br.com.dio.peoplemanagementapi.dto.PersonDTO;
import br.com.dio.peoplemanagementapi.entity.Person;
import br.com.dio.peoplemanagementapi.mapper.PersonMapper;
import br.com.dio.peoplemanagementapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);

        return MessageResponseDTO
                .builder()
                .message("Created person with ID: " + savedPerson.getId())
                .build();
    }
}
