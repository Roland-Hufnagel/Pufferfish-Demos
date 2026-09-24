package org.example;

public class Coffeemaschine {
    int amountOfCoffees;

    void brewCoffee() {
        Engine engine = new Engine();
        engine.startEngine();
        System.out.println("Coffee is coming...");
    }
}
