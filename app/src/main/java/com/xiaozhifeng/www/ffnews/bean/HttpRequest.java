package com.xiaozhifeng.www.ffnews.bean;

/**
 * Created by Administrator on 2016/10/27 0027.
 */
public class HttpRequest<T> {

    private String retCode;

    private String message;

    private T data;


    public HttpRequest() {
    }

    public HttpRequest(String retCode, String message, T data) {
        this.retCode = retCode;
        this.message = message;
        this.data = data;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
