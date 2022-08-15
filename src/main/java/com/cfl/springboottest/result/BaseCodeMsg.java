package com.cfl.springboottest.result;

/**
 * @author cfl
 * @date 2022/8/15 16:01
 */
public interface BaseCodeMsg {
    int getCode();

    String getMsg();

    BaseCodeMsg fillArgs(Object... args);
}
