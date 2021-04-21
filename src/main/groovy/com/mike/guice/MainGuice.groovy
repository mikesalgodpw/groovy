package com.mike.guice

import com.google.inject.Guice
import groovy.json.JsonSlurper

class MainGuice {


    static void main(String[] args) {
        println "hello, I am in GroovyMain2"

        //create the bean
        def injector = Guice.createInjector(new AnimalModule())

        //inject the bean
        def petShop1 = injector.getInstance(PetShop)
        println petShop1.getAnimalSound()

    }
}
