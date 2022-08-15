package com.example.springboottest.result;

/**
 * @author cfl
 * @date 2022/8/15 16:02
 */
public class CommonCodeMsg implements  BaseCodeMsg{
    private int code;
    private String msg;

    //通用的错误码
    public static CommonCodeMsg SUCCESS = new CommonCodeMsg(0, "成功");
    public static CommonCodeMsg CUSTOMIZE = new CommonCodeMsg(1, "%s");
    public static CommonCodeMsg SERVER_ERROR = new CommonCodeMsg(500100, "服务端异常：%s");
    public static CommonCodeMsg BIND_ERROR = new CommonCodeMsg(500101, "参数校验异常：%s");
    public static CommonCodeMsg ENUM_NOT_FOUND = new CommonCodeMsg(500108, "没有找到对应的枚举：%s");

    protected CommonCodeMsg() {
    }

    protected CommonCodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public CommonCodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CommonCodeMsg(code, message);
    }

    @Override
    public String toString() {
        return "CommonCodeMsg [code=" + code + ", msg=" + msg + "]";
    }
}
