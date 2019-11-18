package com.github.ssw.validation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Slf4j
@RestController
public class PersonController {

    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @PostMapping("/validate")
    public void validateTest(@RequestBody Person person){
        if ( person.getGender() == GenderType.MALE ){
            validateTest(person, PersonGroup.Man.class);
        } else {
            validateTest(person, PersonGroup.Girl.class);
        }
        log.info("person : {}", person);
    }

    private<T> void validateTest(T t, Class<?> s){
        Set<ConstraintViolation<T>> violations = validator.validate(t, s);
        log.info("violations : {}", violations);
        if ( !violations.isEmpty() ){
            throw new ConstraintViolationException( violations );
        }
    }
}
