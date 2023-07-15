package org.example.creational.factoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory() ;
        Animal dog = dogFactory.createAnimal() ;
        dog.makeSound();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal() ;
        cat.makeSound();
    }
}
