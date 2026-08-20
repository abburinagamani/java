
package com;

class MyCar {

    String model;
    String color;

    MyCar(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + this.model + " " + this.color);
    }
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        MyCar car1 = new MyCar("Mustang", "red");
        MyCar car2 = new MyCar("Benz", "Black");
        MyCar car3 = new MyCar("BMW", "Pink");

        MyCar[] cars = {car1, car2, car3};

        for (MyCar car : cars) {
            car.drive();
        }
    }
}