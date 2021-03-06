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
    private Integer jumin;

    /*@ValueOfEnum(enumClass = JobType.class)
    @NotNull(groups = {PersonGroup.Man.class, PersonGroup.Girl.class})
    private String job;*/

    @ValueOfEnum(enumClass=JobType.class)
    private JobType job;
}