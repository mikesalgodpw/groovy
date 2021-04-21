package com.mike.guice

import com.google.inject.Inject


class PetShop {

    private Animal animal

    @Inject
    PetShop(Animal animal) {
        this.animal = animal
    }

    String getAnimalSound() {
        return animal.getSound()
    }
}
