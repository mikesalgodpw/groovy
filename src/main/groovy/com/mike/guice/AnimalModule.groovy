package com.mike.guice

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Module
import com.google.inject.Scopes

class AnimalModule implements Module {

        void configure(Binder binder) {

            binder.bind(Animal).to(Dog).in(Scopes.SINGLETON)
            //binder.bind(Animal).to(Cat).in(Scopes.SINGLETON)
        }
}
