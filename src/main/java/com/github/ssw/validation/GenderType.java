package com.github.ssw.validation;

public enum GenderType {
    MALE("GD01"),
    FEMALE("GD02");

    private final String code;

    GenderType(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
