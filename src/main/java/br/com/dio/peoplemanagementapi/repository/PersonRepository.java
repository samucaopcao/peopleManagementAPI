package br.com.dio.peoplemanagementapi.repository;

import br.com.dio.peoplemanagementapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
