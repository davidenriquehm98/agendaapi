package edu.galileo.agenda.controller;

import edu.galileo.agenda.model.Contacto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainPageController {
    @GetMapping
    public String getAll() {
        return "<h1>David Enrique Hernández Macajola</h1><br><h2>23001604@galileo.edu</h2>";
    }
}
