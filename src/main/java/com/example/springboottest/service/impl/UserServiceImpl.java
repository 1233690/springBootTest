package com.example.springboottest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottest.domain.User;
import com.example.springboottest.mapper.UserMapper;
import com.example.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author cfl
 * @date 2022/8/12 16:11
 */
@Service

@Component
public class UserServiceImpl extends ServiceImpl<UserMapper,User > implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(String id) {
        return userMapper.findUserById(id);
    }

    @Override
    public int deleteUserById(String id) {
        return userMapper.deleteById(id);
    }

    @Override
    public String findUserNameById(String id) {
        return userMapper.findUserNameById(id);
    }
}
