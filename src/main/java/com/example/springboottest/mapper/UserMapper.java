package com.example.springboottest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottest.domain.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @author cfl
 * @date 2022/8/12 16:16
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    //@Select("select  * from user where id=#{id}")
    User findUserById(String id);

    //@Select("select  name from user where id=#{id}")
    String findUserNameById(String id);
}
