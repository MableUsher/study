package com.mable.utils;

/**
 * 用于记录日志的工具类，提供了公共的代码
 */
public class logger {
    /**
     * 用于打印日志，计划让其在切入点方法（业务层方法）执行之前执行
     */
    public void printLog(){
        System.out.println("Logger类中的printLog方法开始记录日志了");
    }
}
