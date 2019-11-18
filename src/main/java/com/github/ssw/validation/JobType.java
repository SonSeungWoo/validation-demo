package com.github.ssw.validation;

public enum JobType {
    SOLDIER("JOB1"),

    CITIZEN("JOB2");

    private final String code;

    JobType(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
