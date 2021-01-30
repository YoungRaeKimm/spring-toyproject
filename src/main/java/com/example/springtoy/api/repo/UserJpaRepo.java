package com.example.springtoy.api.repo;

import com.example.springtoy.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User, Long> {

}
