package com.pp.jooq.dao;

import com.pp.jooq.model.Tables;
import com.pp.jooq.model.tables.pojos.MetaTable;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gupp
 * @date 2022/11/7 17:24
 */

@Repository
public class MetaUnityDao {

    @Resource
    @Qualifier("metaDslContext")
    private DSLContext dslContext;

    public MetaTable query(String namespace, String tableName) {
        List<MetaTable> metaTables = dslContext.select()
                .from(Tables.META_TABLE)
                .where(Tables.META_TABLE.NAMESPACE.eq(namespace))
                .and(Tables.META_TABLE.TABLE_NAME.eq(tableName))
                .fetchInto(MetaTable.class);
        return metaTables.size() == 1 ? metaTables.get(0) : null;
    }
}
