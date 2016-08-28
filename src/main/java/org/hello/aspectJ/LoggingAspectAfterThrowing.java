package org.hello.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspectAfterThrowing {
	@AfterThrowing(
			pointcut = "execution(* org.hello.aspectJ.CustomerBo.addCustomerReturnValue(..))",
			throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error){
		System.out.println("logAfterReturn () is running");
		System.out.println("hijaked : "  + joinPoint.getSignature().getName());
		System.out.println("Exception : "  + error);
		System.out.println("===========");
	}
}
