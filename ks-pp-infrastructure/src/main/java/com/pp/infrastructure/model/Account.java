package com.pp.infrastructure.model;

import lombok.Data;

/**
 * @author gupp
 * @date 2022/3/4 12:27 上午
 */

@Data
public class Account {

    private Long accountId;

    private String corporationName;

    private String productName;

    private String industry;

    private String phone;

    private String email;

    private String address;

    private Long createTime;

    private Long updateTime;
}
