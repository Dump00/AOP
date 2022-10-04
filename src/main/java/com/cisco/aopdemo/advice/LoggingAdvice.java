package com.cisco.aopdemo.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAdvice {

    Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);

    @Around("myPointCut()")
    public void appLogger(ProceedingJoinPoint joinPoint) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getClass().toString();
        Object[] args = joinPoint.getArgs();

        logger.info("method invoked: " + className + "::" + methodName + "(" + mapper.writeValueAsString(args) + ")");
    }

    @Pointcut(value = "execution(* com.cisco.aopdemo.*.*.*(..))")
    public void myPointCut() {

    }
}
