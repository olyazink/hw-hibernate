package ru.netology.hwhibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hwhibernate.repository.Repository;

@RestController
public class Controller {
    private final Repository hiberRepository;

    public Controller( Repository hiberRepository) {
        this.hiberRepository = hiberRepository;
    }

    @GetMapping("/persons/by-city")
    public String getSqlSetup(@RequestParam String city) {
        return hiberRepository.getPersonsByCity(city).toString();
    }
}
