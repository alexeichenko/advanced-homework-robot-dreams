package com.rd_spring.homeworkrobotdreams.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagementService {
    private final UserService userService;

    @Autowired
    public UserManagementService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
