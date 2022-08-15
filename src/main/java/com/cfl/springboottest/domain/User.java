package com.cfl.springboottest.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
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

    private Long id;
    private String userName;
    private String password;
    private String name;
    private String sex;
    @TableLogic()//该注解表示使用逻辑删除
    @TableField(fill = FieldFill.INSERT)  //执行插入时自动填充
    private Byte activated;

}
