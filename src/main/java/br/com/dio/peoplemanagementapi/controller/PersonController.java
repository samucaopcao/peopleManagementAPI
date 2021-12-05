package br.com.dio.peoplemanagementapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping("/api")
    public String teste(){
        return "A nossa primeira API esta funcionando";
    }

}
