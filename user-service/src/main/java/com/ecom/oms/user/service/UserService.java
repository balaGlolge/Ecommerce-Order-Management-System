package com.ecom.oms.user.service;

import com.ecom.oms.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    User updateUser(Long id, User user);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
