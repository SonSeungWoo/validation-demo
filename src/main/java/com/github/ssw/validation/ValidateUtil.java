package com.github.ssw.validation;

import lombok.experimental.UtilityClass;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@UtilityClass
public class ValidateUtil {

    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static  <T> void violation(T t, Class<?> s){
        Set<ConstraintViolation<T>> violations = validator.validate(t, s);
        System.out.println(String.format("violations : %s", violations));
        if ( !violations.isEmpty() ){
            throw new ConstraintViolationException( violations );
        }
    }
}
