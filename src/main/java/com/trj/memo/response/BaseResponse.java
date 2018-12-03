package com.trj.memo.response;

public class BaseResponse {

    private static BaseResponse baseResponse;

    private int code;

    private Object object;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static BaseResponse success(){
        baseResponse = new BaseResponse();
        baseResponse.code =200;
        return baseResponse;
    }

    public static BaseResponse fail(Exception e){
        baseResponse = new BaseResponse();
        baseResponse.code = 100;
        baseResponse.object = e;
        return baseResponse;
    }

}
