package com.example.qeydiyyat.service;

import com.example.qeydiyyat.model.User;
import com.example.qeydiyyat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    public void registerUser(User user) {

        repository.save(user);
    }
}
