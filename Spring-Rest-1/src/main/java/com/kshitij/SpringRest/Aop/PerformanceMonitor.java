package com.kshitij.SpringRest.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitor {
	private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitor.class);
	
	@Around("execution(* com.kshitij.SpringRest.Controller.myController.getCourses(..))")
	private Object monitorTime(ProceedingJoinPoint pjp) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Object proceed = pjp.proceed();
		long end = System.currentTimeMillis();
		
		
		LOGGER.info("Time taken :" +(end-start) + "ms");
		return proceed;
	}
}
