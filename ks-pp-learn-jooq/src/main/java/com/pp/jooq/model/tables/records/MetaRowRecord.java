/*
 * This file is generated by jOOQ.
 */
package com.pp.jooq.model.tables.records;


import com.pp.jooq.model.tables.MetaRow;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.15"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetaRowRecord extends UpdatableRecordImpl<MetaRowRecord> implements Record6<Long, Long, Long, String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>meta.meta_row.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>meta.meta_row.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>meta.meta_row.create_time</code>. 创建时间
     */
    public void setCreateTime(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>meta.meta_row.create_time</code>. 创建时间
     */
    public Long getCreateTime() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>meta.meta_row.update_time</code>. 更新时间
     */
    public void setUpdateTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>meta.meta_row.update_time</code>. 更新时间
     */
    public Long getUpdateTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>meta.meta_row.creator</code>. 创建人
     */
    public void setCreator(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>meta.meta_row.creator</code>. 创建人
     */
    public String getCreator() {
        return (String) get(3);
    }

    /**
     * Setter for <code>meta.meta_row.operator</code>. 更新人
     */
    public void setOperator(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>meta.meta_row.operator</code>. 更新人
     */
    public String getOperator() {
        return (String) get(4);
    }

    /**
     * Setter for <code>meta.meta_row.table_id</code>. 关联的表ID
     */
    public void setTableId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>meta.meta_row.table_id</code>. 关联的表ID
     */
    public Long getTableId() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Long, Long, String, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MetaRow.META_ROW.ID;
    }

    @Override
    public Field<Long> field2() {
        return MetaRow.META_ROW.CREATE_TIME;
    }

    @Override
    public Field<Long> field3() {
        return MetaRow.META_ROW.UPDATE_TIME;
    }

    @Override
    public Field<String> field4() {
        return MetaRow.META_ROW.CREATOR;
    }

    @Override
    public Field<String> field5() {
        return MetaRow.META_ROW.OPERATOR;
    }

    @Override
    public Field<Long> field6() {
        return MetaRow.META_ROW.TABLE_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCreateTime();
    }

    @Override
    public Long component3() {
        return getUpdateTime();
    }

    @Override
    public String component4() {
        return getCreator();
    }

    @Override
    public String component5() {
        return getOperator();
    }

    @Override
    public Long component6() {
        return getTableId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCreateTime();
    }

    @Override
    public Long value3() {
        return getUpdateTime();
    }

    @Override
    public String value4() {
        return getCreator();
    }

    @Override
    public String value5() {
        return getOperator();
    }

    @Override
    public Long value6() {
        return getTableId();
    }

    @Override
    public MetaRowRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MetaRowRecord value2(Long value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public MetaRowRecord value3(Long value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public MetaRowRecord value4(String value) {
        setCreator(value);
        return this;
    }

    @Override
    public MetaRowRecord value5(String value) {
        setOperator(value);
        return this;
    }

    @Override
    public MetaRowRecord value6(Long value) {
        setTableId(value);
        return this;
    }

    @Override
    public MetaRowRecord values(Long value1, Long value2, Long value3, String value4, String value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetaRowRecord
     */
    public MetaRowRecord() {
        super(MetaRow.META_ROW);
    }

    /**
     * Create a detached, initialised MetaRowRecord
     */
    public MetaRowRecord(Long id, Long createTime, Long updateTime, String creator, String operator, Long tableId) {
        super(MetaRow.META_ROW);

        setId(id);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
        setCreator(creator);
        setOperator(operator);
        setTableId(tableId);
    }
}
