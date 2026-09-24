package org.example;

import java.util.Objects;

public class Car {

    private String brand = "BMW";
    private String color;
    private int power;
    private int age = 10;
    String serialNr = "sdfkjw42342h";
    String password = "345kjh535k";

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age) {
            this.age = age;
        }
    }

    public Car(String color, int power) {
        this.color = color;
        this.power = power;
    }

    public Car(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }


    void startEngine() {
        System.out.println("Starting engine ...");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && age == car.age &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(color, car.color) &&
                Objects.equals(serialNr, car.serialNr) &&
                Objects.equals(password, car.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, power, age, serialNr, password);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", Color='" + color + '\'' +
                ", power=" + power +
                ", age=" + age +
                ", serialNr='" + serialNr + '\'' +
                '}';
    }
}
