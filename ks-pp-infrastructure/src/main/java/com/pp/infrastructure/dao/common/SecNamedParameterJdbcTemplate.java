package com.pp.infrastructure.dao.common;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author gupp
 * @date 2022/3/13 5:13 下午
 */
public class SecNamedParameterJdbcTemplate extends NamedParameterJdbcTemplate {

    public SecNamedParameterJdbcTemplate(JdbcOperations classicJdbcTemplate) {
        super(classicJdbcTemplate);
    }

    @Override
    protected PreparedStatementCreator getPreparedStatementCreator(String sql, SqlParameterSource paramSource, Consumer<PreparedStatementCreatorFactory> customizer) {
        return super.getPreparedStatementCreator(sql, new EncryptSqlParameterSource(paramSource), customizer);
    }


    @Override
    public <T> T query(String sql, SqlParameterSource paramSource, ResultSetExtractor<T> rse) throws DataAccessException {
        return super.query(sql, paramSource, rs -> {
            return rse.extractData(new ResultSetWrapper(rs));
        });
    }

    @Override
    public <T> List<T> query(String sql, SqlParameterSource paramSource, RowMapper<T> rowMapper) throws DataAccessException {
        return super.query(sql, paramSource, (rs, rowNum) -> rowMapper.mapRow(new ResultSetWrapper(rs), rowNum));
    }

    @Override
    public void query(String sql, SqlParameterSource paramSource, RowCallbackHandler rch) throws DataAccessException {
        super.query(sql, paramSource, rs -> {
            rch.processRow(new ResultSetWrapper(rs));
        });
    }

    @Override
    public <T> T queryForObject(String sql, SqlParameterSource paramSource, RowMapper<T> rowMapper) throws DataAccessException {
        return super.queryForObject(sql, paramSource, (rs, rowNum) -> rowMapper.mapRow(new ResultSetWrapper(rs), rowNum));
    }

    @Override
    public SqlRowSet queryForRowSet(String sql, SqlParameterSource paramSource) throws DataAccessException {
        return super.queryForRowSet(sql, new EncryptSqlParameterSource(paramSource));
    }
}
