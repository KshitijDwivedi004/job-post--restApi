package com.kshitij.SpringRest.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginAspect.class);
	
//	return_type , Class name , method name , args 
	
	@Before("execution(* com.kshitij.SpringRest.Controller.myController.getCourses(..))")
	public void loginMethodCall(JoinPoint jp) {
		LOGGER.info("Method called " + jp.getSignature().getName());
	}
//	@After("execution(* com.kshitij.SpringRest.Controller.myController.getCourses(..))")
//	public void loginMethodAfter(JoinPoint jp) {
//		LOGGER.info("Method excuted " + jp.getSignature().getName());
//	}
//	
//	@AfterThrowing("execution(* com.kshitij.SpringRest.Controller.myController.getCourses(..))")
//	public void loginMethodAfterThrow(JoinPoint jp) {
//		LOGGER.info("Method excuted " + jp.getSignature().getName());
//	}
//	
//	@AfterReturning("execution(* com.kshitij.SpringRest.Controller.myController.getCourses(..))")
//	public void loginMethodAfterReturn(JoinPoint jp) {
//		LOGGER.info("Method excuted " + jp.getSignature().getName());
//	}
//	
//
}
