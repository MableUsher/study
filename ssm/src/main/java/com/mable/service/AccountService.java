package com.mable.service;

import com.mable.domain.Account;

import java.util.List;

/**
 * 账户业务层接口
 */

public interface AccountService {
    /**
     * 查询账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     */
    public void saveAccount(Account account);
}
