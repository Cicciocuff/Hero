package com.example.demo.superhero.controller;

import com.example.demo.superhero.entity.Superhero;
import com.example.demo.superhero.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/superheroes")
public class SuperheroController {

    private final SuperheroService superheroService;

    @Autowired
    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    // Create
    @PostMapping
    public void addSuperhero(@RequestBody Superhero superhero) {
        superheroService.addSuperhero(superhero);
    }

    // Read
    @GetMapping
    public List<Superhero> getAllSuperheroes() {
        return superheroService.getAllSuperheroes();
    }

    @GetMapping(path = "{id}")
    public Superhero getSuperheroById(@PathVariable("id") Long id) {
        return superheroService.getSuperheroById(id);
    }

    // Update
    @PutMapping(path = "{id}")
    public void updateSuperhero(@PathVariable("id") Long id, @RequestBody Superhero superheroToUpdate) {
        superheroService.updateSuperhero(id, superheroToUpdate);
    }

    // Delete
    @DeleteMapping(path = "{id}")
    public void deleteSuperhero(@PathVariable("id") Long id) {
        superheroService.deleteSuperhero(id);
    }
}
