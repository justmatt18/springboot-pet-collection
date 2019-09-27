package com.mat.app.rest_mongodb.service.Impl;

import com.mat.app.rest_mongodb.model.Pet;
import com.mat.app.rest_mongodb.repository.PetRepository;
import com.mat.app.rest_mongodb.service.PetService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public List<Pet> list() {
        return petRepository.findAll();
    }

    @Override
    public Optional<Pet> getSinglePet(ObjectId id) {
        return petRepository.findById(String.valueOf(id));
    }

    @Override
    public void deletePet(ObjectId id) {
        petRepository.deleteById(String.valueOf(id));
    }

    @Override
    public Pet updatePet(ObjectId id, Pet pet) {
        pet.setId(id);
        petRepository.save(pet);
        return pet;
    }

    @Override
    public List<Pet> listBySpecies(String species) {
        return petRepository.findBySpecies(species);
    }

    @Override
    public List<Pet> listByBreed(String breed) {
        return petRepository.findByBreed(breed);
    }
}
