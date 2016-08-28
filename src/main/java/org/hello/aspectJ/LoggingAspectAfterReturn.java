package org.hello.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspectAfterReturn {
	@AfterReturning(
			pointcut = "execution(* org.hello.aspectJ.CustomerBo.addCustomerReturnValue(..))",
			returning = "result")
	public void logAfterThrowing(JoinPoint joinPoint, Object result){
		System.out.println("logAfterReturn () is running");
		System.out.println("hijaked : "  + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("===========");
	}
}
