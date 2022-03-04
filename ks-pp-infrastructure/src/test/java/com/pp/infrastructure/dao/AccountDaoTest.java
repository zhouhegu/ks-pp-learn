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
        System.out.println(accountDao.insert(new Account()));
    }
}
