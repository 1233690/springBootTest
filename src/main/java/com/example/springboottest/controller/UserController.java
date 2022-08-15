package com.example.springboottest.controller;

import com.example.springboottest.domain.User;
import com.example.springboottest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author cfl
 * @date 2022/8/12 16:03
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/findUserName/{id}")
    public String findUserNameById(@PathVariable String id) {
        log.info("传入id：{}", id);
        String result = userService.findUserNameById(id);
        log.info("查询结果：{}", result);
        return result;
    }

    @GetMapping("/findUser")
    public User findUserById() {
        String id = String.valueOf(1);
        log.info("传入id：{}", id);
        User result = userService.findUserById(id);
        log.info("查询结果：{}", result);
        return result;
    }

    @GetMapping("/deleteUser")
    public int deleteUserById() {
        String id = String.valueOf(1);
        log.info("传入id：{}", id);
        int result = userService.deleteUserById(id);
        log.info("查询结果：{}", result);
        return result;
//        return  1;
    }


}
