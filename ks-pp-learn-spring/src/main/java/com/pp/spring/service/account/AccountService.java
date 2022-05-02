package com.pp.spring.service.account;


import com.pp.infrastructure.model.Account;

/**
 * @author gupp
 * @date 2022/5/2 17:51
 */

public interface AccountService {

    /**
     * 查询广告主信息
     * @param accountId 广告主ID
     * @return 广告主信息
     */
    Account queryByAccountId(Long accountId);
}
