package com.github.ssw.validation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
public class Person {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private int age;

    @NotNull
    private GenderType gender;

    @NotNull(groups = PersonGroup.Girl.class)
    private Integer juminNo;
}
