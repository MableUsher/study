package com.mable.service.impl;

import com.mable.dao.IAccountDao;
import com.mable.domain.Account;
import com.mable.service.IAccountService;
import com.mable.utils.TransactionManager;

import java.util.List;

/**
 * 账户的业务层实现类
 *
 * 事务控制应该都在业务层
 */
public class AccountServiceImpl_OLD implements IAccountService {
    private IAccountDao accountDao;
      private TransactionManager tsManager;

    public void setTsManager(TransactionManager tsManager) {
        this.tsManager = tsManager;
    }

    public void setAccountDao(IAccountDao accountDao) {

        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        try {
            //1.开启事务
            tsManager.beginTransation();
            //2.执行操作
            List<Account> accounts = accountDao.findAllAccount();
            //3.提交事务
            tsManager.commit();
            //4.返回结果
            return accounts;
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.释放连接
            tsManager.release();
        }

    }

    public Account findAccountById(Integer accountId) {
        try {
        //1.开启事务
        tsManager.beginTransation();
        //2.执行操作
        Account account = accountDao.findAccountById(accountId);
        //3.提交事务
        tsManager.commit();
        //4.返回结果
        return account;
    }catch (Exception e){
        //5.回滚操作
        tsManager.rollback();
            throw new RuntimeException(e);
    }finally {
        //6.释放连接
        tsManager.release();
    }

    }

    public void saveAccount(Account account) {
        try {
        //1.开启事务
        tsManager.beginTransation();
        //2.执行操作
        accountDao.saveAccount(account);
        //3.提交事务
        tsManager.commit();
    }catch (Exception e){
        //4.回滚操作
        tsManager.rollback();
        }finally {
        //5.释放连接
        tsManager.release();
        }

    }

    public void updateAccount(Account account) {
        try{
        //1.开启事务
        tsManager.beginTransation();
        //2.执行操作
        accountDao.updateAccount(account);
        //3.提交事务
        tsManager.commit();
        }catch (Exception e){
        //4.回滚操作
        tsManager.rollback();
        }finally {
        //5.释放连接
        tsManager.release();
        }

    }

    public void deleteAccount(Integer accountId) {
        try{
        //1.开启事务
        tsManager.beginTransation();
        //2.执行操作
        accountDao.deleteAccount(accountId);
        //3.提交事务
        tsManager.commit();
        }catch (Exception e){
        //4.回滚操作
        tsManager.rollback();
        }finally {
        //5.释放连接
        tsManager.release();
        }
        accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {
        try{
            //1.开启事务
            tsManager.beginTransation();
            //2.执行操作

            //2.1.根据名称查询转出账户
            Account source = accountDao.findAccountByName(sourceName);
            //2.2.根据名称查询转入账户
            Account target = accountDao.findAccountByName((targetName));
            //2.3.转出账户减钱
            source.setMoney(source.getMoney()-money);
            //2.4.转入账户加钱
            target.setMoney(target.getMoney()+money);
            //2.5.更新转出账户
            accountDao.updateAccount(source);
            //2.6.更新转入账户
            accountDao.updateAccount(target);

            //3.提交事务
            tsManager.commit();
        }catch (Exception e){
            //4.回滚操作
            tsManager.rollback();
        }finally {
            //5.释放连接
            tsManager.release();
        }

    }
}
