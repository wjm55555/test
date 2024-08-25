package com.example.demo034.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo034.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User getUserById(Long id);
    Page<User> getUserList(String userName, int pageNum, int pageSize);
}