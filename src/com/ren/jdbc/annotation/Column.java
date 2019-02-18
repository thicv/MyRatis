package com.ren.jdbc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
/**
 * 指定了实际物理表的某一列的名称
 * @author REN
 *
 */
public @interface Column {
    String value() default "";
}
