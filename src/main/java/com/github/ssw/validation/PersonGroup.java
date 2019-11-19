package com.github.ssw.validation;

import javax.validation.groups.Default;

public interface PersonGroup {
    interface Man extends Default {}

    interface Girl extends Default {}
}
