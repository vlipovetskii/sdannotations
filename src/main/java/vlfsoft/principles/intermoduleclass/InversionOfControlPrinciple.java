package vlfsoft.principles.intermoduleclass;

import vlfsoft.principles.ProgrammingPrinciple;

import java.lang.annotation.*;

/**
 * See <a href="http://java-design-patterns.com/principles/#inversion-of-control">Inversion of Control</a>
 */
@ProgrammingPrinciple.InterModule
@Documented
@Inherited
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface InversionOfControlPrinciple {
}
