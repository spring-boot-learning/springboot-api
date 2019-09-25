package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.mapper.UserMapper;
import com.spring.boot.entity.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int delete(Integer id) {
        return userMapper.deleteById(id);
    }

    public int update(User user) {
        return userMapper.updateById(user);
    }

    public User searchById(Integer id) {
        return userMapper.selectById(id);
    }

    public List<User> search() {
        return userMapper.queryAll();
    }
}
