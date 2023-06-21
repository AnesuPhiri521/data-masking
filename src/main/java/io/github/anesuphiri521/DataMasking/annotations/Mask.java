package io.github.anesuphiri521.DataMasking.annotations;

/*
 * @created - 20/06/2023
 * @project - DataMasking
 * @author - anesuphiri - sehphirry@gmail.com
 */

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Mask {
    int startPosition();
    int endPosition();
    char maskingCharacter() default '*';
}
