package com.mable.service.impl;

import com.mable.dao.IAccountDao;
import com.mable.dao.impl.AccountDaoImpl;
import com.mable.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

 private IAccountDao accountDao = new AccountDaoImpl();


    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
