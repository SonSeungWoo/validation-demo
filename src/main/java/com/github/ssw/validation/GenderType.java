package com.github.ssw.validation;

import java.util.function.Consumer;

import static com.github.ssw.validation.ValidateUtil.violation;

public enum GenderType {
    MALE("GD01", person -> violation(person, PersonGroup.Man.class)),
    FEMALE("GD02", person -> violation(person, PersonGroup.Girl.class));

    private final String code;

    private final Consumer<Person> consumer;

    GenderType(String code, Consumer<Person> consumer) {
        this.code = code;
        this.consumer = consumer;
    }

    public String getCode() {
        return code;
    }

    public void validCheck(Person person) {
        consumer.accept(person);
    }
}
