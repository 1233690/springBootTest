package com.cfl.springboottest.controller;

import com.cfl.springboottest.domain.User;
import com.cfl.springboottest.dto.UserDTO;
import com.cfl.springboottest.result.Result;
import com.cfl.springboottest.service.UserService;
import com.cfl.springboottest.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
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
@Api("用户模块")
public class UserController {


    @Autowired
    private UserService userService;

    @ApiOperation("通过id查找用户姓名")
    @GetMapping("/findUserName/{id}")
    public String findUserNameById(@PathVariable String id) {
        log.info("传入id：{}", id);
        String result = userService.findUserNameById(id);
        log.info("查询结果：{}", result);
        return result;
    }

    @ApiOperation("通过id查找用户")
    @GetMapping("/findUser/{id}")
    public Result<UserDTO> findUserById(@PathVariable String id) {
//        String id = String.valueOf(1);
        log.info("传入id：{}", id);
        UserDTO result = userService.findUserById(id);
        log.info("查询结果：{}", result);
        return Result.success(result);
    }

    @ApiOperation("通过id删除用户")
    @GetMapping("/deleteUser/{id}")
    public int deleteUserById(@PathVariable String id) {
        log.info("传入id：{}", id);
        int result = userService.deleteUserById(id);
        log.info("查询结果：{}", result);
        return result;
    }

    @ApiOperation("修改用户信息")
    @PostMapping("/updateUser")
    public int updateUserById(User user) {
        return userService.updateUserById(user);
    }

    @ApiOperation("新增用户")
    @PostMapping("/saveUser")
    public int insertUser(UserVO user) {
        return userService.saveUser(user);
    }


}
