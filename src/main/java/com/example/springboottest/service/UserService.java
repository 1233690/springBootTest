package com.example.springboottest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboottest.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author cfl
 * @date 2022/8/12 16:08
 */
@Service
public interface UserService  extends IService<User> {
    String findUserNameById(String id);


    User findUserById(String id);


    int deleteUserById(String id);

}