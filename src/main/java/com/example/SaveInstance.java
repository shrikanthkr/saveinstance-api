package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shrikanth on 11/13/16.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface SaveInstance {
}
