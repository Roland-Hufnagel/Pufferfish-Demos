package org.example.pufferfishspringdatajpa.repos;

import org.example.pufferfishspringdatajpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
}
