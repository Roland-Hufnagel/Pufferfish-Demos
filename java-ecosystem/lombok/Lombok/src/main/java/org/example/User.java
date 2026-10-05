package org.example;

public class User {

    private Long id;
    private String name;
    private String email;
    private int age;

    // Package-privater All-ArgsConstructor (wie von Lombok standardmäßig generiert)
    User(Long id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Statische Fabrikmethode
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    // Statische innere Builder-Klasse
    public static class UserBuilder {

        private Long id;
        private String name;
        private String email;
        private int age;

        UserBuilder() {
        }

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this.id, this.name, this.email, this.age);
        }
    }
}