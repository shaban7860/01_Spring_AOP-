package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnoSecurityAspect {
	
//	@Before("execution(* com.sky.aop.ApplicationService.*(..))")
	public void VerifyApplicationForm() {
		System.out.println("Ina anno before call");
	}
	
//	@After("execution(* com.sky.aop.ApplicationService.*(..))")
	public void processResults() {
		System.out.println("processResults");
	}
	
	@After("@annotation(com.sky.aop.Log)")
	public void processloger() {
		System.out.println("processResults");
	}

}
