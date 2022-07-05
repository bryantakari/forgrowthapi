package com.bryan.forgrowth.controller.result;

import java.io.Serializable;

public class Result implements Serializable {

    private static final long serialVersionUID = -5961832311073660282L;

    private String errorCode;
    private String message;
    private boolean success;
    private Object object;

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object getObject() {
        return object;
    }
}
