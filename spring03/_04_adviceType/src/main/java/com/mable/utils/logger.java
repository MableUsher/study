package com.mable.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 用于记录日志的工具类，提供了公共的代码
 */
public class logger {
    /**
     * 前置通知
     */
    public void beforePrintLog(){

        System.out.println("Logger类中的beforePrintLog方法开始记录日志了");

    }
    /**
     * 后置通知
     */
    public void afterReturningPrintLog(){

        System.out.println("Logger类中的afterReturningPrintLog方法开始记录日志了");
    }
    /**
     * 异常通知
     */
    public void afterThorwingPrintLog(){

        System.out.println("Logger类中的afterThorwingPrintLog方法开始记录日志了");
    }
    /**
     * 最终通知
     */
    public void afterPrintLog(){

        System.out.println("Logger类中的afterPrintLog方法开始记录日志了");
    }

    /**
     * 环绕通知
     * 当配置了环绕通知之后，切入点方法没有执行，而环绕通知方法却执行了
     * 分析：通过对比动态代理中环绕通知代码，它的通知有明确的切入点方法调用
     * 解决： Spring框架为我们提供了一个接口：ProceedingJoinPoint。该接口有一个方法proceed()
     *      此方法就相当于明确调用切入点方法，该接口可以作为环绕通知的方法参数，
     *      在程序执行时，spring框架会为我们提供该接口的实现类供我们使用
     */
    public Object aroundPrintLog(ProceedingJoinPoint pjp ){
        Object rtvalue = null;
        Object[] args = pjp.getArgs();
        try {
            System.out.println("前置通知");
            rtvalue = pjp.proceed(args);
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        }finally {
            System.out.println("最终通知");
        }
        return rtvalue;
    }
}
