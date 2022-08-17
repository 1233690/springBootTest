package com.cfl.springboottest.service.impl;

import com.cfl.springboottest.service.UserService;
import com.cfl.springboottest.domain.User;
import com.cfl.springboottest.dto.UserDTO;
import com.cfl.springboottest.mapper.UserMapper;
import com.cfl.springboottest.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cfl
 * @date 2022/8/12 16:11
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO findUserById(String id) {
        User user = userMapper.findUserById(id);
        log.info("user:{}", String.valueOf(user));
        //把数据库对象转换成dto
        UserDTO userDTO = new UserDTO();
        if (user != null) {
            BeanUtils.copyProperties(user, userDTO);
            log.info("userDTO:{}", userDTO);
        } else {
            log.info("查询不到数据");
        }

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
    public int saveUser(UserVO userVO) {
        User user = new User();
        log.info("userVO:{}", String.valueOf(userVO));
        BeanUtils.copyProperties(userVO, user);
        return userMapper.insert(user);
    }

    @Override
    public String findUserNameById(String id) {
        return userMapper.findUserNameById(id);
    }
}
