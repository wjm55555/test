package com.example.demo034.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String userName;
    private String password;
    private String avatarPath;
    private String phone;
    private String email;
    private Integer gender;
    private String address;
    private String introduction;
    private String trueName;
    private Integer status;
    private Date createTime;
    private Date updateTime;
}