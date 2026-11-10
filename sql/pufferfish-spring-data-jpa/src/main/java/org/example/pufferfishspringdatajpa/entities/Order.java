package org.example.pufferfishspringdatajpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
// @Data
// toString , hashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private Long id;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
