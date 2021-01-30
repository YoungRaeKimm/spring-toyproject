package com.example.springtoy.controller.v1;

import com.example.springtoy.api.entity.User;
import com.example.springtoy.api.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {
    private final UserJpaRepo userJpaRepo;

    @GetMapping(value = "/user")
    public List<User> findAllUser(){
        return userJpaRepo.findAll();
    }

    @PostMapping(value = "/user")
    public User save(){
        User user = User.builder()
                .uid("yumi@naver.omc")
                .name("dbal")
                .build();
        return userJpaRepo.save(user);
    }
}
