package com.example.demo.superhero.service;

import com.example.demo.superhero.entity.Superhero;
import com.example.demo.superhero.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperheroService {

    private final SuperheroRepository superheroRepository;

    @Autowired
    public SuperheroService(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    // Create
    public void addSuperhero(Superhero superhero) {
        superheroRepository.save(superhero);
    }

    // Read
    public List<Superhero> getAllSuperheroes() {
        return superheroRepository.findAll();
    }

    public Superhero getSuperheroById(Long id) {
        return superheroRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Superhero with id " + id + " does not exist"));
    }

    // Update
    public void updateSuperhero(Long id, Superhero superheroToUpdate) {
        Superhero superhero = getSuperheroById(id);
        // update the superhero object and save
        superheroRepository.save(superhero);
    }

    // Delete
    public void deleteSuperhero(Long id) {
        boolean exists = superheroRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Superhero with id " + id + " does not exist");
        }
        superheroRepository.deleteById(id);
    }
}
