package org.sse.eport.Basic;

import lombok.Data;

/**
 * @author ZTL
 */
@Data
public class Result {
    private String code;
    private String message;
    private Object data;

    Result(String code,String message){
        this.code = code;
        this.message = message;
    }

    public static Result success(){
        return new Result(SUCCESS_CODE,SUCCESS_MESSAGE);
    }
    public static Result fail(){
        return new Result(SUCCESS_CODE,FAIL_MESSAGE);
    }

    public static final String SUCCESS_CODE = "200" ;
    public static final String SUCCESS_MESSAGE = "success";
    public static final String FAIL_MESSAGE = "fail";

}
