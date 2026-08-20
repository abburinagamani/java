package com;

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();      // inherited from Animal
        dog.sleep();    // inherited from Animal
        dog.bark();     // Dog's own method

        System.out.println();

        Cat cat = new Cat();

        cat.eat();      // inherited from Animal
        cat.sleep();    // inherited from Animal
        cat.meow();     // Cat's own method
    }
}