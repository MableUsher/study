package com.mable.service;

import com.mable.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {
    List<Account> findAllAccount();
    Account findAccountById(Integer accountId);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Integer accountId);

    /**
     * 转账
     * @param sourceName 转出账户
     * @param targetName 转入账户
     * @param money     转账金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
