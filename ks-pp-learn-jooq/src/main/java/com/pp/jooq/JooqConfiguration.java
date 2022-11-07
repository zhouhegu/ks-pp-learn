package com.pp.jooq;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author gupp
 * @date 2022/11/7 17:17
 */
@Configuration
public class JooqConfiguration {

    @Bean
    public DSLContext metaDslContext(DataSource dataSource) {
        DefaultConfiguration configuration = new DefaultConfiguration();
        configuration.settings().withRenderSchema(false);
        configuration.set(SQLDialect.MYSQL);
        configuration.set(dataSource);
        return DSL.using(configuration);
    }
}
