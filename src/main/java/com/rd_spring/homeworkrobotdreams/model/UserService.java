package com.rd_spring.homeworkrobotdreams.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();
    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
