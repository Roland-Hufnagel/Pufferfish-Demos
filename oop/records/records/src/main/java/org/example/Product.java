package org.example;

public record Product(String title, String id, double price, boolean onStock) {

    // Compact Constructor:
    public Product {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        //...
    }

    // Alternative Constructor:
    public Product(String title, String id, double price) {
        this(title, id, price, false);
        //...
    }


    public boolean isFree() {
        return price <= 0;
    }

    public Product withOnStock(boolean onStock) {
        return new Product(title, id, price, onStock);
    }
}
