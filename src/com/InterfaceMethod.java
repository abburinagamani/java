package com;

interface IntAnimal {

    void sound();   // interface method
}

class IntDog implements IntAnimal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceMethod {

    public static void main(String[] args) {

        // Interface reference + class object
        IntAnimal animal = new IntDog();

        animal.sound();
    }
}