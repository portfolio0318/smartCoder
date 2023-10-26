package com.smartcoder.common;


import lombok.Data;

import java.io.Serializable;
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer code;

    private String message;

    private Object data;

    public Result() {
    }

    public static Result success(Object data) {
        return new Result(200, "success", data);
    }

    public static Result success() {
        return new Result(200, "success", null);
    }

    public static Result fail(String message) {
        return new Result(400, message, null);
    }


    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
