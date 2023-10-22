package com.zzy.handler;

import com.zzy.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Slf4j
@RestControllerAdvice
@Order(2)
public class OtherException {

    /** 运行时异常 */
    @ExceptionHandler(RuntimeException.class)
    public Result runtimeExceptionHandler(RuntimeException ex) {
        log.error("运行时异常：{}", ex.getMessage(), ex);
        return Result.error(ex.getMessage(), null);
    }

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception ex) {
        log.error("其他异常：{}", ex.getMessage(), ex);
        return Result.error(ex.getMessage(), null);
    }
}
