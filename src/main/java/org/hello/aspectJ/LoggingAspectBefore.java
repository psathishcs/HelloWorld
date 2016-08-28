package org.hello.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspectBefore {
	@Before("execution(* org.hello.aspectJ.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint){
		System.out.println("logBeofe () is running");
		System.out.println("hijaked : "  + joinPoint.getSignature().getName());
		System.out.println("===========");
	}
}
