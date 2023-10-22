package Natsu.Ebac;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.CONSTRUCTOR})
public @interface TabelaAnnotation {
    String value();
    long numeroDaSala ();
    String[] sala();

}
