package com.ahxinin.chain;

import lombok.Getter;
import lombok.Setter;

/**
 * 校验结果
 */
@Getter
@Setter
public class ValidResult {
    
    private boolean success;
    private String message;

    public static ValidResult error(String message){
        return new ValidResult(false,message);
    }

    public static ValidResult ok(){
        return new ValidResult(true,"");
    }

    public ValidResult( boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
