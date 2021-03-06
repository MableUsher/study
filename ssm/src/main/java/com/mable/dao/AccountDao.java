package com.mable.dao;

import com.mable.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户持久层接口
 */
@Repository
public interface AccountDao {
    /**
     * 查询账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

}
