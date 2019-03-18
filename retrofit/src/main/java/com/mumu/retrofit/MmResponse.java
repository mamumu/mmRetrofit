package com.mumu.retrofit;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 * 后台数据返回的基类
 */
public class MmResponse<T> {

    private boolean Success;
    private int StatusCode;
    private String Message;
    private T Result;

    public boolean isSuccess() {
        return Success;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int statusCode) {
        StatusCode = statusCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public T getResult() {
        return Result;
    }

    public void setResult(T result) {
        Result = result;
    }
}
