package com.example.springtoy.api.repo;

import com.example.springtoy.api.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepo extends JpaRepository<Board, Long> {
    Board findByName(String name);
}
