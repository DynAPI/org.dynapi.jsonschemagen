package org.dynapi.jsonschemagen;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Examples {
    /**
     * dunnp
     */
    String[] value();
}
