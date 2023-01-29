package com.ahxinin.chain;


import com.sun.tools.javac.main.Main.Result;

/**
 * 校验结果
 */
public class ValidResult {
    
    private boolean success;
    private String message;
    private Object data;

    public static ValidResult error(String message){
        return error(message);
    }

    public static ValidResult error(Integer code,String message){
        return error(code,message,null);
    }

    public static ValidResult error(Integer code,String message,Object data){
        return new ValidResult(code,message,data,false);
    }


    public static ValidResult ok(){
        return ok(Result.SUCCESS, Result.MSG_SUCCESS);
    }


    public static ValidResult ok(Integer code,String message){
        return ok(code,message,null);
    }

    public static ValidResult ok(Integer code,String message,Object data){
        return new ValidResult(code,message,data,true);
    }

    public ValidResult(Integer code, String message, Object data,boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
