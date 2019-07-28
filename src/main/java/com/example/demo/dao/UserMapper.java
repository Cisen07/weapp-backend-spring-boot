package com.example.demo.dao;

import com.example.demo.domain.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}