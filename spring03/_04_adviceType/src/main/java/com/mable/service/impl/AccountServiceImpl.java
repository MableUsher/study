package com.mable.service.impl;

import com.mable.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    @Override
    public void saveAccount() {
        System.out.println("保存了");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("更新了"+i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("删除了");
        return 0;
    }
}
