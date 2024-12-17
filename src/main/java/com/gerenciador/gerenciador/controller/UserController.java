package com.gerenciador.gerenciador.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciador.gerenciador.Model.User;
import com.gerenciador.gerenciador.repository.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/users")
@Component
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;

    @GetMapping
    public List<User> list () {
        return userRepository.findAll();
    }
}
