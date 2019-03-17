package com.mable.dao.impl;

import com.mable.dao.IAccountDao;
import org.springframework.stereotype.Repository;


/**
 * 账户的持久层实现类
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    public  void saveAccount(){
        System.out.println("已保存");
    }
}