package com.github.ssw.validation;

import static com.github.ssw.validation.ValidateUtil.violation;

public enum GenderType {
    MALE("GD01"){
        @Override
        public void validCheck(Person person) {
            violation(person, PersonGroup.Man.class);
        }
    },

    FEMALE("GD02"){
        @Override
        public void validCheck(Person person) {
            violation(person, PersonGroup.Girl.class);
        }
    };

    private final String code;

    GenderType(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public abstract void validCheck(Person person);
}
