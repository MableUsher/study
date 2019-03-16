package com.mable.service.impl;


import com.mable.service.IAccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name,Integer age,Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public void  saveAccount(){
        System.out.println("service中的save方法执行"+name+","+age+","+birthday);
    }
}
