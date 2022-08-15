package com.cfl.springboottest.service;


import com.cfl.springboottest.domain.User;
import com.cfl.springboottest.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @author cfl
 * @date 2022/8/12 16:08
 */
@Service
public interface UserService {
    String findUserNameById(String id);


    UserDTO findUserById(String id);


    int deleteUserById(String id);

    int updateUserById(User user);

    int saveUser(User user);
}
