package org.example.pufferfishspringdatajpa.repos;

import org.example.pufferfishspringdatajpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
