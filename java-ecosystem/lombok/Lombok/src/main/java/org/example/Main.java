package org.example;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alex", 100, false);
        System.out.println(s.getAge());
        s.setAge(22);
        System.out.println(s);

        Product p = new Product("Apple", 200.0);
        System.out.println(p);
        System.out.println(p.withBrand("Samsung"));
        System.out.println(p);

       Student s2 = Student.builder()
                .name("John")
                .build();
        System.out.println(s2);
    }
}