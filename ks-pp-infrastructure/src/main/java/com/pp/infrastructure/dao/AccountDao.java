package com.pp.infrastructure.dao;

import com.pp.infrastructure.dao.common.SecNamedParameterJdbcTemplate;
import com.pp.infrastructure.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author gupp
 * @date 2022/3/4 10:55 下午
 */

@Repository("accountDao")
public class AccountDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Account getByAccountId(Long accountId) {
        String sql = "SELECT * FROM account WHERE account_id = ?";
        Account account = new Account();
        jdbcTemplate.query(sql, rs -> {
            account.setAccountId(accountId);
            account.setCorporationName(rs.getString("corporation_name"));
            account.setProductName(rs.getString("product_name"));
            account.setIndustry(rs.getString("industry"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setAddress(rs.getString("address"));
            account.setCreateTime(rs.getLong("create_time"));
            account.setUpdateTime(rs.getLong("update_time"));
        }, accountId);
        return account;
    }

    public List<Account> getByAccountId2(Long accountId) {
        String sql = "SELECT * FROM account WHERE account_id = ?";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Account account = new Account();
            account.setAccountId(accountId);
            account.setCorporationName(rs.getString("corporation_name"));
            account.setProductName(rs.getString("product_name"));
            account.setIndustry(rs.getString("industry"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setAddress(rs.getString("address"));
            account.setCreateTime(rs.getLong("create_time"));
            account.setUpdateTime(rs.getLong("update_time"));
            return account;
        }, accountId);
    }

    public int insert(Account account) {
        String sql = "INSERT INTO account(corporation_name, product_name, industry, phone, email, address, create_time, update_time)" +
                "VALUES (?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, ps -> {
            ps.setString(1, account.getCorporationName());
            ps.setString(2, account.getProductName());
            ps.setString(3, account.getIndustry());
            ps.setString(4, account.getPhone());
            ps.setString(5, account.getEmail());
            ps.setString(6, account.getAddress());
            ps.setLong(7, account.getCreateTime());
            ps.setLong(8, account.getUpdateTime());
        });
    }

    public int insertByNamed(Account account) {
        String sql = "INSERT INTO account(corporation_name, product_name, industry, phone, email, address, create_time, update_time)" +
                "VALUES(:corporationName, :productName, :industry, :phone, :email, :address, :createTime, :updateTime)";
        SqlParameterSource sps = new BeanPropertySqlParameterSource(account);
        return namedParameterJdbcTemplate.update(sql, sps);
    }

    public int insertByNamed2(Account account) {
        String sql = "INSERT INTO account(corporation_name, product_name, industry, phone, email, address, create_time, update_time)" +
                "VALUES(:corporationName, :productName, :industry, :phone, :email, :address, :createTime, :updateTime)";
        SqlParameterSource sps = new MapSqlParameterSource()
                .addValue("corporationName", account.getCorporationName())
                .addValue("productName", account.getProductName())
                .addValue("industry", account.getIndustry())
                .addValue("phone", account.getPhone())
                .addValue("email", account.getEmail())
                .addValue("address", account.getAddress())
                .addValue("createTime", account.getCreateTime())
                .addValue("updateTime", account.getUpdateTime());
        return namedParameterJdbcTemplate.update(sql, sps);
    }

    public int secInsert(Account account) {
        String sql = "INSERT INTO account(corporation_name, product_name, industry, phone, email, address, create_time, update_time)" +
                "VALUES(:corporationName, :productName, :industry, :phone, :email, :address, :createTime, :updateTime)";
        SecNamedParameterJdbcTemplate secNamedParameterJdbcTemplate = new SecNamedParameterJdbcTemplate(namedParameterJdbcTemplate.getJdbcOperations());
        SqlParameterSource sps = new MapSqlParameterSource()
                .addValue("corporationName", account.getCorporationName())
                .addValue("productName", account.getProductName())
                .addValue("industry", account.getIndustry())
                .addValue("phone", account.getPhone())
                .addValue("email", account.getEmail())
                .addValue("address", account.getAddress())
                .addValue("createTime", account.getCreateTime())
                .addValue("updateTime", account.getUpdateTime());
        return secNamedParameterJdbcTemplate.update(sql, sps);
    }

    public Account secGetByAccountId(Long accountId) {
        String sql = "SELECT * FROM account WHERE account_id = :accountId";
        SqlParameterSource sps = new MapSqlParameterSource()
                .addValue("accountId", accountId);
        Account account = new Account();
        SecNamedParameterJdbcTemplate secNamedParameterJdbcTemplate = new SecNamedParameterJdbcTemplate(namedParameterJdbcTemplate.getJdbcOperations());
        secNamedParameterJdbcTemplate.query(sql, sps, rs -> {
            account.setAccountId(accountId);
            account.setCorporationName(rs.getString("corporation_name"));
            account.setProductName(rs.getString("product_name"));
            account.setIndustry(rs.getString("industry"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setAddress(rs.getString("address"));
            account.setCreateTime(rs.getLong("create_time"));
            account.setUpdateTime(rs.getLong("update_time"));
        });
        return account;
    }

    public List<Account> queryAll() {
        String sql = "SELECT * FROM account";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Account account = new Account();
            account.setAccountId(rs.getLong("account_id"));
            account.setCorporationName(rs.getString("corporation_name"));
            account.setProductName(rs.getString("product_name"));
            account.setIndustry(rs.getString("industry"));
            account.setPhone(rs.getString("phone"));
            account.setEmail(rs.getString("email"));
            account.setAddress(rs.getString("address"));
            account.setCreateTime(rs.getLong("create_time"));
            account.setUpdateTime(rs.getLong("update_time"));
            return account;
        });
    }
}
