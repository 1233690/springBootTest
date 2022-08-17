package com.cfl.springboottest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cfl.springboottest.domain.User;

import com.cfl.springboottest.dto.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author cfl
 * @date 2022/8/12 16:16
 */
@Mapper
//@Repository
public interface UserMapper extends BaseMapper<User> {
//    @Select("select  * from user where id=#{id}")
    User findUserById(@Param("id") String id);

//    @Select("select  name from user where id=#{id}")
    String findUserNameById(@Param("id") String id);


//   PageBean  getUserByPage(IPage page);
}
