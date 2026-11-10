package org.example.pufferfishspringdatajpa;

import org.example.pufferfishspringdatajpa.entities.Order;
import org.example.pufferfishspringdatajpa.entities.User;
import org.example.pufferfishspringdatajpa.repos.OrderRepo;
import org.example.pufferfishspringdatajpa.repos.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class PufferfishSpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PufferfishSpringDataJpaApplication.class, args);


    }

    @Bean
    CommandLineRunner demoData(UserRepo userRepo, OrderRepo orderRepo) {
        return args -> {
            // 1. Anlegen (INSERT)
            User alice = userRepo.save(new User(1L, "Alice", List.of()));
            User bob = userRepo.save(new User(2L, "Bob", List.of()));

            orderRepo.save(new Order(1L, new BigDecimal("19.99"), alice));
            orderRepo.save(new Order(2L, new BigDecimal("42.50"), alice));
            orderRepo.save(new Order(3L, new BigDecimal("9.90"), bob));

            // 2. Ändern (UPDATE): Es gibt kein update() – laden, Setter, save()
            User bobToRename = userRepo.findById(2L).orElseThrow();
            bobToRename.setName("Bobby");
            userRepo.save(bobToRename);

            Order orderToChange = orderRepo.findById(1L).orElseThrow();
            orderToChange.setPrice(new BigDecimal("24.99"));
            orderRepo.save(orderToChange);

            // 3. Löschen (DELETE)
            orderRepo.deleteById(2L);
            System.out.println(userRepo.findById(2L).get().getName());

        };
    }


}
