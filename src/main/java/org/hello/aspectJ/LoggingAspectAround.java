package org.hello.aspectJ;

import java.util.Arrays;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspectAround {
	@Around("execution(* org.hello.aspectJ.CustomerBo.addCustomerAround(..))")
	public void logAfterThrowing(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("logAfterReturn () is running");
		System.out.println("hijaked : "  + joinPoint.getSignature().getName());
		System.out.println("hijaked arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around After is running!");
		System.out.println("===========");
	}
}
