package org.example.restcontrolleradvice.model;

import jakarta.validation.constraints.*;

public record Product(
        @Min(18)
        @Max(100)
        int id,

        String brand,
        @Pattern(regexp = "[0-9]")
        @NotEmpty(message = "Name can not be empty")
        @Size(min = 3, message = "Must be at least 3 characters")
        String name) {
}
