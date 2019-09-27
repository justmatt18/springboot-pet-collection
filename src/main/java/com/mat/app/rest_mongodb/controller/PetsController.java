package com.mat.app.rest_mongodb.controller;


import com.mat.app.rest_mongodb.form.PetCreateForm;
import com.mat.app.rest_mongodb.form.PetUpdateForm;
import com.mat.app.rest_mongodb.model.Pet;
import com.mat.app.rest_mongodb.service.PetService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pets")
public class PetsController {

    private final PetService petService;

    public PetsController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public String render() {
        return "index";
    }

    @GetMapping("/list")
    public List<Pet> list() {
        return petService.list();
    }

    @GetMapping("/{id}")
    public Optional<Pet> getSinglePet(@PathVariable ObjectId id) {
        Optional<Pet> singlePet = petService.getSinglePet(id);
        return singlePet;
    }

    @PostMapping
    public Pet createPet(@RequestBody @Valid PetCreateForm form) {
       Pet pet = petService.createPet(new Pet (form.getName(), form.getSpecies(), form.getBreed()));
       return pet;
    }

    @PutMapping("/{id}")
    public Pet updatePet(@PathVariable ObjectId id,@RequestBody @Valid PetUpdateForm form) {
        return petService.updatePet(id, new Pet(form.getName(), form.getSpecies(), form.getBreed()));
    }


    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable ObjectId id) {
        petService.deletePet(id);
    }

    @GetMapping("/species/{species}")
    public List<Pet> listBySpecies(@PathVariable("species") String species, @PathParam("name") String name) {
       return petService.listBySpecies(species);
    }

    @GetMapping("/breed/{breed}")
    public List<Pet> listByBreed(@PathVariable String breed) {
        return petService.listByBreed(breed);
    }
}
