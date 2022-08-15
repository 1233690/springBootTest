package com.example.springboottest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottest.domain.User;
import com.example.springboottest.dto.UserDTO;
import com.example.springboottest.mapper.UserMapper;
import com.example.springboottest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author cfl
 * @date 2022/8/12 16:11
 */
@Slf4j
@Service
//@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO findUserById(String id) {
        User user = userMapper.findUserById(id);
        log.info("user:{}", String.valueOf(user));
        //把数据库对象转换成dto
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        log.info("userDTO:{}", userDTO);
        return userDTO;
    }

    @Override
    public int deleteUserById(String id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int updateUserById(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public String findUserNameById(String id) {
        return userMapper.findUserNameById(id);
    }
}
