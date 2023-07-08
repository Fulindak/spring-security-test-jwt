package com.example.testsecurityjwt.repositorie;

import com.example.testsecurityjwt.entitie.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String userName);
}
