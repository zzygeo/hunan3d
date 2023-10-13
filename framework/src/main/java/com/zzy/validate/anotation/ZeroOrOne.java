package com.zzy.validate.anotation;

import com.zzy.validate.ZeroOrOneValidator;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target({ElementType.FIELD})
@Constraint(validatedBy = ZeroOrOneValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ZeroOrOne {
    String message() default "数据只能为'0'或者'1'";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
