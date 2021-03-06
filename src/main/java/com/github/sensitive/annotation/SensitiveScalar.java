package com.github.sensitive.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface SensitiveScalar {

    String name() default "default";

    String alias() default "default";
}
