package org.koreait.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class SpringProxyCalculator {



    /*@Before("publicTarget()") // 호출 전
    public void beforeProcess(JoinPoint joinPoint) throws Throwable {
        System.out.println("@Before!");
    }

    @After("publicTarget()")
    public void afterProcess(JoinPoint joinPoint) throws Throwable {
        System.out.println("@After!");
    }*/

    // @Around("publicTarget()") // 적용 범위가 설정된 메서드명 입력
    @Around("CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime();
        try {
            Object result = joinPoint.proceed(); // 핵심 기능 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
