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
        String sql = "SELECT * FROM account WHERE account_id = ?";
        Account account = new Account();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                account.setAccountId(accountId);
                account.setCorporationName(rs.getString("corporation_name"));
                account.setProductName(rs.getString("product_name"));
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
        String sql = "INSERT INTO account(corporation_name, product_name, industry, phone, email, address, create_time, update_time)" +
                "values(?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, account.getCorporationName(), account.getProductName(),
                account.getIndustry(), account.getPhone(), account.getEmail(), account.getAddress(),
                account.getCreateTime(), account.getUpdateTime());
    }
}
