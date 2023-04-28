package com.nfeng.annotation;

import com.nfeng.enums.VisitBehavior;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface VisitLogger {
	/**
	 * 访问行为枚举
	 */
	VisitBehavior value() default VisitBehavior.UNKNOWN;
}
