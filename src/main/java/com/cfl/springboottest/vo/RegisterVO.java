package com.cfl.springboottest.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cfl
 * @date 2022/8/17 16:10
 */
@Data
@ApiModel("注册用户对象入参")
public class RegisterVO {

    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("性别")
    private String sex;
}
