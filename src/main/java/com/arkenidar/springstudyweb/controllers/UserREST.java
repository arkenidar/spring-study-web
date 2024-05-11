package com.arkenidar.springstudyweb.controllers;

import org.springframework.web.bind.annotation.*;

import com.arkenidar.springstudyweb.user.*;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserREST {

    private UserRepository repository;
    private UserService service;

    public UserREST(UserRepository userRepository, UserService userService) {
        repository = userRepository;
        service = userService;
    }

    @GetMapping("/")
    public Iterable<User> findAll() {
        return repository.findAll();
    }

    @GetMapping("/add_samples")
    public Iterable<User> addSamples() {

        repository.save(new User("Dario Cangialosi", new Date(), Gender.MALE));
        repository.save(new User("Dario Cangialosi Junior", new Date(), Gender.MALE));

        return findAll();
    }

    @GetMapping("/delete_by_id")
    public Iterable<User> deleteById(@RequestParam Long id) {
        service.deleteUser(id);
        return findAll();
    }

}
