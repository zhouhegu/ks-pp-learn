package com.pp.spring.service.account.impl;

import com.pp.infrastructure.dao.AccountDao;
import com.pp.infrastructure.model.Account;
import org.springframework.stereotype.Service;
import com.pp.spring.service.account.AccountService;

import javax.annotation.Resource;

/**
 * @author gupp
 * @date 2022/5/2 17:59
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public Account queryByAccountId(Long accountId) {
        Account account = accountDao.getByAccountId(accountId);
        System.out.println(account);
        return account;
    }
}
