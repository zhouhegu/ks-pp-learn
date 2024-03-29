/*
 * This file is generated by jOOQ.
 */
package com.pp.jooq.model;


import com.pp.jooq.model.tables.MetaData;
import com.pp.jooq.model.tables.MetaField;
import com.pp.jooq.model.tables.MetaRow;
import com.pp.jooq.model.tables.MetaTable;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in meta.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.15"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>meta.meta_data</code>.
     */
    public static final MetaData META_DATA = MetaData.META_DATA;

    /**
     * The table <code>meta.meta_field</code>.
     */
    public static final MetaField META_FIELD = MetaField.META_FIELD;

    /**
     * The table <code>meta.meta_row</code>.
     */
    public static final MetaRow META_ROW = MetaRow.META_ROW;

    /**
     * The table <code>meta.meta_table</code>.
     */
    public static final MetaTable META_TABLE = MetaTable.META_TABLE;
}
