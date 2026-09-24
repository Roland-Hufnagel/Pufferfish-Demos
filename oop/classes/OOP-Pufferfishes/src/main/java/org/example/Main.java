package org.example;

public class Main {
    public static void main(String[] args) {
/*        Car myCar = new Car("blue", 200);
        Car myCar2 = new Car("Mercedes", "red", 300);
        Car myCar3 = new Car();*/

/*        myCar.power = myCar.power + 10;
        System.out.println(myCar.brand);
        System.out.println(myCar.color);
        System.out.println(myCar.power);*/
/*        myCar.setAge(myCar.getAge() + 1);
        System.out.println(myCar.getAge());
        myCar.startEngine();*/

/*        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2); // prüft identität
        System.out.println(s1.equals(s2)); // prüft inhaltsgleichheit*/

        Car c1 = new Car("Red", "BMW", 55);
        Car c2 = new Car("Red", "BMW", 55);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }
}
