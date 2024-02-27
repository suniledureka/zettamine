package com.zettamine.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	@Before("com.zettamine.aop.configs.CommonPointcutDefs.businessMethodConfig())")	
	public void logBeforeMethodCall(JoinPoint joinPoint) {
		System.out.println("Starting Execution of  - \"" + joinPoint.getSignature().getName() + "()\" - with " + joinPoint.getArgs().length + " parameters");
	}
	
	@AfterReturning(pointcut = "com.zettamine.aop.configs.CommonPointcutDefs.businessMethodConfig())", returning = "returnValue")
	public void logAfterSuccessfulMethodCall(JoinPoint joinPoint, Object returnValue) {
		System.out.println("Execution Completed for \"" + joinPoint.getSignature().getName() + "()\" with "+ joinPoint.getArgs().length + " arguments and returns - "+ returnValue);
	}
	
	@After("com.zettamine.aop.configs.CommonPointcutDefs.businessMethodConfig())")
	public void logAfterMethodCall(JoinPoint joinPoint) {
		System.out.println("After Aspect - \"" + joinPoint.getSignature().getName() +"()\" has executed");
	}	
	
	@AfterThrowing(pointcut = "com.zettamine.aop.configs.CommonPointcutDefs.businessMethodConfig())", throwing = "ex" )
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception ex) {
		System.out.println(joinPoint.getSignature().getName()+"() fired an exception -> " + ex.toString());
	}
}
