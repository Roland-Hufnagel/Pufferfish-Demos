package org.example;

public record Product(String id, String brand, String name, String description,
                      double price) {
    public boolean priceAbove100() {
        return price > 100;
    }
}
