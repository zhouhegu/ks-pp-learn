package com.pp.spring.common.aop;

import com.pp.infrastructure.model.Account;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author gupp
 * @date 2022/5/2 17:52
 */

@Aspect
@EnableAspectJAutoProxy
@Component
public class AccountAspect {

    @Pointcut("execution(* com.pp.spring.service.account.*.*(..))")
    private void pointCutMethod() {

    }

    @Before("pointCutMethod()")
    public void doBefore() {
        System.out.println("===前置增强===");
    }

    @AfterReturning(pointcut = "pointCutMethod()", returning = "account")
    public void doAfterReturning(Account account) {
        System.out.println("===后置增强，返回值：" + account);
    }

    @AfterThrowing(pointcut = "pointCutMethod()", throwing = "e")
    public void doAfterThrowing(Exception e) {
        System.out.println("===异常抛出增强，异常：" + e.getMessage());
    }

    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===环绕增强，进入方法===");
        Object o = pjp.proceed();
        System.out.println(o.getClass().getName());
        System.out.println("===环绕增强，退出方法===");
        return o;
    }
}
