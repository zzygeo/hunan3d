package com.zzy.validate;

import com.zzy.validate.anotation.ZeroOrOne;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZeroOrOneValidator implements ConstraintValidator<ZeroOrOne, String> {
    @Override
    public void initialize(ZeroOrOne constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.equals("1") || value.equals("0")) {
            return true;
        } else {
            return false;
        }
    }
}
