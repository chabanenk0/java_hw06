package com.github.chabanenk0.Annotation;

import java.lang.annotation.*;

/**
 * Created by dmitry on 19.12.16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Use {
    String value() default "";
}
