package com.example.springboottest.service;

import com.example.springboottest.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author cfl
 * @date 2022/8/12 16:08
 */
@Service
public interface UserService {
    String findUserNameById(String id);


    User findUserById(String id);

}
