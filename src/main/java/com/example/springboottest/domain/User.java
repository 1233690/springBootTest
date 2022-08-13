package com.example.springboottest.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author cfl
 * @date 2022/8/12 16:50
 */
@Data
@ToString
@TableName("user")
public class User {

    private  Integer id;
    private  String userName;
    private  String password;
    private  String name;
    private  String sex;

}
