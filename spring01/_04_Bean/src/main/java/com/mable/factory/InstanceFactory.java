package com.mable.factory;

import com.mable.service.IAccountService;
import com.mable.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类存在jar包中，无法通过修改源码来提供默认构造函数
 */
public class InstanceFactory {
    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
