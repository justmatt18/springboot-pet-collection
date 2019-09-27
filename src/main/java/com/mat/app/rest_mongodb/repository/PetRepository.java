package com.mat.app.rest_mongodb.repository;

import com.mat.app.rest_mongodb.model.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface PetRepository extends MongoRepository<Pet, String> {

    List<Pet> findBySpecies(String species);

    List<Pet> findByBreed(String breed);

}
