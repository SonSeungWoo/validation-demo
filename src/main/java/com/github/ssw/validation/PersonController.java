package com.github.ssw.validation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class PersonController {

    @PostMapping("/validate")
    public void validateTest(@Valid @RequestBody Person person){
        person.getGender().typeCheck(person);
        log.info("person : {}", person);
    }
}
