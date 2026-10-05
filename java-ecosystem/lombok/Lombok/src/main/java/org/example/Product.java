package org.example;

import lombok.With;

@With
public record Product(String brand, double price) {
}
