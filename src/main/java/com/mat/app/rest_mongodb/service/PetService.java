package com.mat.app.rest_mongodb.service;

import com.mat.app.rest_mongodb.model.Pet;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface PetService {

    List<Pet> list();

    Optional<Pet> getSinglePet(ObjectId id);

    Pet createPet(Pet pet);

    void deletePet(ObjectId id);

    Pet updatePet(ObjectId id, Pet pet);

    List<Pet> listBySpecies(String species);

    List<Pet> listByBreed(String breed);

}
