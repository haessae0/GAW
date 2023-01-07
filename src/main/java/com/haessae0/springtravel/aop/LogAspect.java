package com.haessae0.springtravel.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    //BookService의 모든 메서드
//    @Around("execution(* com.example.demo.service.BookService.*(..))")
    /*@Around("execution(* com.example.demo.controller..*.*(..))")*/
    @Around("execution(* com.haessae0.springtravel..*.*(..))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("### START ### - " + pjp.getSignature().getDeclaringTypeName() + " ### " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        logger.info("### FINISHED ### - " + pjp.getSignature().getDeclaringTypeName() + " ### " + pjp.getSignature().getName());
        return result;
    }
}