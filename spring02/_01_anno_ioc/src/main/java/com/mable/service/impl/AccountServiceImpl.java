package com.mable.service.impl;

import com.mable.dao.IAccountDao;
import com.mable.dao.impl.AccountDaoImpl;
import com.mable.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 账户的业务层实现类
 *
 * <bean id="accountService" class="com.mable.service.impl.AccountServiceImpl"></bean>
 */
@Component(value ="accountService" )
@Scope("singleton")
//@Scope("protptype")
public class AccountServiceImpl implements IAccountService {
@Autowired
 private IAccountDao accountDao ;
    @PostConstruct
    public  void init(){
        System.out.println("初始化方法执行了");
}
    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法执行了");
    }
    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
