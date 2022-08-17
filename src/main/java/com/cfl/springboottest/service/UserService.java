package com.cfl.springboottest.service;


import com.cfl.springboottest.domain.User;
import com.cfl.springboottest.dto.PageBean;
import com.cfl.springboottest.dto.UserDTO;
import com.cfl.springboottest.vo.RegisterVO;
import com.cfl.springboottest.vo.UserVO;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author cfl
 * @date 2022/8/12 16:08
 */
@Service
public interface UserService {
    String findUserNameById(String id);


    UserDTO findUserById(String id);
//    PageBean findAllUser();

    int deleteUserById(String id);

    int updateUserById(User user);

    Integer saveUser(UserVO user);

    int signUp(RegisterVO registerVO);
}
