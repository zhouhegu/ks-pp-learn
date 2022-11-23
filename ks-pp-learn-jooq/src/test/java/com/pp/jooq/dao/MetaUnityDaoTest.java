package com.pp.jooq.dao;

import com.pp.jooq.model.tables.pojos.MetaTable;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author gupp
 * @date 2022/11/7 17:32
 */
public class MetaUnityDaoTest extends ApplicationTest{

    @Resource
    private MetaUnityDao metaUnityDao;

    @Test
    public void testQuery() {
        MetaTable metaTable = metaUnityDao.query("policy", "corporation_whitelist");
        System.out.println(metaTable);
    }
}
