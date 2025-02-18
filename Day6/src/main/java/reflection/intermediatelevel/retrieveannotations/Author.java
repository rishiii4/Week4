package reflection.intermediatelevel.retrieveannotations;

import java.lang.annotation.*;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String name();
}

