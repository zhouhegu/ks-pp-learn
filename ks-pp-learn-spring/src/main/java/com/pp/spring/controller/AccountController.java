package com.pp.spring.controller;

import com.pp.infrastructure.model.Account;
import com.pp.spring.service.account.AccountService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/list")
    public List<Account> index() {
        return accountService.queryAll();
    }
}
