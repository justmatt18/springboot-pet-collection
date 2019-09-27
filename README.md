# springboot-pet-collection

A mini project called Pet Collection made with Spring Boot and Mongo DB.

A Rest API that can Create, Read, Update, Delete and Filter List by Species or by Breed. 

**Technologies Used:**

* Spring Boot -> Java Web Framework that aims to shorten the code length and provide you with the easiest way to develop a web application.
* Mongo DB -> Database
* Postman -> Test API

**Set up your Mongo DB:**
1. Create a database called "rest_tutorial"
2. Create a collection called "pets"
3. Try inserting a record by: 

A pet collection that has: 
```
{
    "name": "petname",
    "species": "dog",
    "breed": "husky"
}

```

in console: 
```
mongodb // enter in mongodb instance

use rest_tutorial; // create a database called 'rest_tutorial' if it does not exist

db.createCollection("pets"); // create a collection called 'pets'

```

*Add some data*

```
db.pets.insertOne([
    {
        "name" : "Bruno",
        "species" : "dog",
        "breed" : "pitbull"
    }
])
```

*Add multiple data*

```
db.pets.insertMany([
  {
    "name" : "Spot",
    "species" : "dog",
    "breed" : "pitbull"
  },
  {
    "name" : "Daisy",
    "species" : "cat",
    "breed" : "calico"
  },
  {
    "name" : "Bella",
    "species" : "dog",
    "breed" : "australian shepard"
  }
]);
```


Download and install Postman :
[Postman Installer](https://www.getpostman.com/downloads/)

-> Open Postman

-> To list all pet
GET: localhost:8080/api/pets/list 

-> To fetch single pet by ID
```
GET: localhost:8080/api/pets/{id} 
```

-> specify the data by: 
POST: localhost:8080/api/pets/ 
> Clicking the Body->JSON and put this:
```

{
    "name": "PetName",
    "species": "Cat",
    "breed": "Sphynx"
}

```

-> Update pet data by ID
PUT: localhost:8080/api/pets/{id}
> Clicking the Body->JSON and put this:
```

{
    "name": "Updated PetName",
    "species": "Cat",
    "breed": "Persian Cat"
}

```

-> To Delete a Pet Record by ID
DELETE: localhost:8080/api/pets/{id}


-> filter list by species
```
GET: localhost:8080/api/pets/species/{species_name}
```

-> filter list by breed
```
GET: localhost:8080/api/pets/species/{breed_name}
```


