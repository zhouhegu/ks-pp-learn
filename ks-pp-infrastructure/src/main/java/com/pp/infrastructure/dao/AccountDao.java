package com.pp.infrastructure.dao;

import com.pp.infrastructure.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author gupp
 * @date 2022/3/4 10:55 下午
 */

@Repository
public class AccountDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Account getByAccountId(Long accountId) {
        String sql = "SELECT * FROM account WHERE accountId = ?";
        Account account = new Account();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                account.setAccountId(accountId);
                account.setCorporationName(rs.getString("corporationName"));
                account.setProductName(rs.getString("productName"));
                account.setIndustry(rs.getString("industry"));
                account.setPhone(rs.getString("phone"));
                account.setEmail(rs.getString("email"));
                account.setAddress(rs.getString("address"));
                account.setCreateTime(rs.getLong("create_time"));
                account.setUpdateTime(rs.getLong("update_time"));
            }
        }, accountId);
        return account;
    }

    public int insert(Account account) {
        return 0;
    }
}
