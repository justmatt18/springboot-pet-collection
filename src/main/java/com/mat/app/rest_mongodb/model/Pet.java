package com.mat.app.rest_mongodb.model;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document("pets")
public class Pet {

    @Id
    private ObjectId id;

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @NotNull
    private String species;

    @NotBlank
    @NotNull
    private String breed;

    public Pet(String name, String species, String breed) {
        this.name = name;
        this.species = species;
        this.breed = breed;
    }

    public String getId() {
        return id.toHexString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
