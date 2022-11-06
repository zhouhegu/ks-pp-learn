package com.pp.spring.service.account;

import com.pp.infrastructure.model.Account;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author gupp
 * @date 2022/5/2 18:23
 */
public class AccountServiceTest extends KsPpSpringApplicationTest{

    @Resource
    private AccountService accountService;

    @Test
    public void testQuery() {
        Account account = accountService.queryByAccountId(1L);
        System.out.println(account);
    }
}
