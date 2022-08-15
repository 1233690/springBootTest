package com.cfl.springboottest.result;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cfl
 * @date 2022/8/15 15:57
 */
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(T data) {
//        return new Result(data == null ? new JSONObject() : data);
        return new Result(data);
    }

    /**
     * 成功时候的调用转换成手机端需要的格式封装一层
     */
    public static <T> Result<T> successMap(T data) {
        Map<String, Object> map = new HashMap<>();
        map.put("content", data);
        return new Result(map);
    }

    public static <T> Result<T> success() {
        return new Result<T>(CommonCodeMsg.SUCCESS);
    }

    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(BaseCodeMsg codeMsg) {
        return new Result<T>(codeMsg);
    }

    /**
     * 失败时候带数据
     */
    public static <T> Result<T> error(BaseCodeMsg codeMsg, T data) {
        Result<T> tResult = new Result<>(codeMsg);
        tResult.setData(data);
        return tResult;
    }

    private Result(T data) {
        this.code=CommonCodeMsg.SUCCESS.getCode();
        this.msg=CommonCodeMsg.SUCCESS.getMsg();
        this.data = data;
    }


    public Result() {

    }

    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(BaseCodeMsg codeMsg) {
        if (codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
