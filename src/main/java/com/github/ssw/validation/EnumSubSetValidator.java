package com.github.ssw.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class EnumSubSetValidator implements ConstraintValidator<EnumSubset, JobType> {
    private JobType[] subset;

    @Override
    public void initialize(EnumSubset constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(JobType value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(value);
    }
}