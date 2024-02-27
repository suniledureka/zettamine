package com.zettamine.boot.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductServiceAspect {
	@Before(value = "execution(* com.zettamine.boot.aop.services.ProductServices.*(..)) and args(productId, productName, productPrice)")  
	public void beforeAdvice(JoinPoint joinPoint, Integer productId, String productName, Float productPrice) {  
		System.out.println("Before method - 1:" + joinPoint.getSignature());  
		System.out.println(String.format("Creating Product with %d, %s, %.2f",productId, productName, productPrice));  
	}
	
	
	@Before(value = "execution(* com.zettamine.boot.aop.services.ProductServices.*(..))")  
	public void beforeAdvice1(JoinPoint joinPoint) {  
		System.out.println("Before method - 2:" + joinPoint.getSignature());  		
	}
}
