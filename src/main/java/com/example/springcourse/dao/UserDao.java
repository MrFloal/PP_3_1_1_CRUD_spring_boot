package com.example.springcourse.dao;

import com.example.springcourse.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void deleteUser(long id);
    void addUser(User user);
    void updateUser(User user);
}
