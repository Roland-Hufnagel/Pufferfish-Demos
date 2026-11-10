package org.example.pufferfishspringdatajpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
// @Data
// toString , hashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;


}
