package com.zettamine.aop.configs;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutDefs {
	@Pointcut("execution(* com.zettamine.aop.services.*.*(..))")
	public void businessMethodConfig() {}
}
