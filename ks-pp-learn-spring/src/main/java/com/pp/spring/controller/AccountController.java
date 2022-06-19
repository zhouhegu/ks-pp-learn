package com.pp.spring.controller;

import com.pp.infrastructure.model.Account;
import com.pp.spring.service.account.AccountService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gupp
 * @date 2022/5/3 17:35
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> index() {
        return accountService.queryAll();
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public Account queryByAccountId(@RequestParam("accountId") Long accountId) {
        return accountService.queryByAccountId(accountId);
    }
}
