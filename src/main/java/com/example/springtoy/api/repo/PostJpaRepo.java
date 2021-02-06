package com.example.springtoy.api.repo;

import com.example.springtoy.api.entity.Board;
import com.example.springtoy.api.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostJpaRepo extends JpaRepository<Post, Long> {
    List<Post> findByBoard(Board board);
}
