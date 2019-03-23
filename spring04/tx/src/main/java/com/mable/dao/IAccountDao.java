package com.mable.dao;

import com.mable.domain.Account;

/**
 * 账户持久层接口
 */
public interface IAccountDao {
    Account findAccountById(Integer accountId);
    Account findAccountByName(String accountName);
    void updateAccount(Account account);
}
