package com.zzy.result;

import com.zzy.constant.HttpStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "result entity", description = "结果集")
public class Result<T> implements Serializable {
    private static final Long serialVersionUID = 1L;
    public static final int SUCCESS = HttpStatus.SUCCESS;
    public static final int ERROR = HttpStatus.ERROR;
    public static final int WARN = HttpStatus.WARN;
    @ApiModelProperty(value = "状态码")
    private int code;
    @ApiModelProperty(value = "系统消息")
    private String msg;
    @ApiModelProperty(value = "数据")
    private T data;

    public static <T> Result<T> success() {
        return build(SUCCESS, "操作成功", null);
    }

    public static <T> Result<T> success(T data) {
        return build(SUCCESS, "操作成功", data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return build(SUCCESS, msg, data);
    }

    public static <T> Result<T> error() {
        return build(ERROR, "操作失败", null);
    }

    public static <T> Result<T> error(T data) {
        return build(ERROR, "操作失败", data);
    }

    public static <T> Result<T> error(String msg, T data) {
        return build(ERROR, msg, data);
    }

    public static <T> Result<T> fail(String msg) {
        return build(ERROR, msg, null);
    }

    public static <T> Result<T> warn(String msg) {
        return build(WARN, msg, null);
    }

    public static <T> Result<T> warn(String msg, T data) {
        return build(WARN, msg, data);
    }

    private static <T> Result<T> build(int code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}
