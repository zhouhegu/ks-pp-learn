package com.pp.infrastructure.dao.common;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

/**
 * @author gupp
 * @date 2022/3/13 5:15 下午
 */
public class EncryptSqlParameterSource implements SqlParameterSource {

    private SqlParameterSource sqlParameterSource;

    private Sensitive sensitive = new Sensitive();

    public EncryptSqlParameterSource(SqlParameterSource sqlParameterSource) {
        this.sqlParameterSource = sqlParameterSource;
    }

    @Override
    public boolean hasValue(String paramName) {
        return false;
    }

    @Override
    public Object getValue(String paramName) throws IllegalArgumentException {
        return sensitive.checkEncrypt(paramName, sqlParameterSource.getValue(paramName));
    }
}
