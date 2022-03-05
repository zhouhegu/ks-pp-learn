package com.pp.infrastructure.dao;

import com.pp.infrastructure.KsPpInfrastructureApplicationTest;
import com.pp.infrastructure.model.Account;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author gupp
 * @date 2022/3/5 12:14 上午
 */
public class AccountDaoTest extends KsPpInfrastructureApplicationTest {

    @Resource
    private AccountDao accountDao;

    @Test
    public void testInsert() {
        Account account = new Account();
        account.setCorporationName("字节跳动");
        account.setProductName("短视频");
        account.setIndustry("娱乐媒体");
        account.setPhone("13888888888");
        account.setEmail("ddd@gmail.com");
        account.setAddress("北京");
        account.setCreateTime(System.currentTimeMillis());
        account.setUpdateTime(System.currentTimeMillis());
        accountDao.insert(account);
    }

    @Test
    public void testQuery() {
        Account account = accountDao.getByAccountId(1L);
        System.out.println(account);
    }
}
