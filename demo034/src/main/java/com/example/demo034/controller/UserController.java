package com.example.demo034.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo034.entity.User;
import com.example.demo034.service.UserService;
import com.example.demo034.vo.ResponseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "User API")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Add a new user")
    @PostMapping
    public ResponseVO<User> addUser(@RequestBody User user) {
        User addedUser = userService.addUser(user);
        return ResponseVO.success(addedUser);
    }

    @ApiOperation(value = "Delete a user by ID")
    @DeleteMapping("/{id}")
    public ResponseVO<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseVO.success("User deleted successfully");
    }

    @ApiOperation(value = "Update user information")
    @PutMapping
    public ResponseVO<String> updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return ResponseVO.success("User updated successfully");
    }

    @ApiOperation(value = "Get user information by ID")
    @GetMapping("/{id}")
    public ResponseVO<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return ResponseVO.success(user);
    }

    @ApiOperation(value = "Get list of users with pagination")
    @GetMapping
    public ResponseVO<Page<User>> getUserList(
            @RequestParam(required = false, defaultValue = "") @ApiParam("Username") String userName,
            @RequestParam @ApiParam("Page number") int pageNum,
            @RequestParam @ApiParam("Page size") int pageSize) {
        Page<User> userPage = userService.getUserList(userName, pageNum, pageSize);
        return ResponseVO.success(userPage);
    }
}