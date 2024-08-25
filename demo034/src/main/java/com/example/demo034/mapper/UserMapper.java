package com.example.demo034.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo034.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
