/*
 * This file is generated by jOOQ.
 */
package com.pp.jooq.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


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
public class MetaTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private Long   createTime;
    private Long   updateTime;
    private String creator;
    private String operator;
    private String tableName;
    private String cnName;
    private String desc;
    private String namespace;

    public MetaTable() {}

    public MetaTable(MetaTable value) {
        this.id = value.id;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.creator = value.creator;
        this.operator = value.operator;
        this.tableName = value.tableName;
        this.cnName = value.cnName;
        this.desc = value.desc;
        this.namespace = value.namespace;
    }

    public MetaTable(
        Long   id,
        Long   createTime,
        Long   updateTime,
        String creator,
        String operator,
        String tableName,
        String cnName,
        String desc,
        String namespace
    ) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.creator = creator;
        this.operator = operator;
        this.tableName = tableName;
        this.cnName = cnName;
        this.desc = desc;
        this.namespace = namespace;
    }

    /**
     * Getter for <code>meta.meta_table.id</code>. 主键
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>meta.meta_table.id</code>. 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>meta.meta_table.create_time</code>. 创建时间
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>meta.meta_table.create_time</code>. 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>meta.meta_table.update_time</code>. 更新时间
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Setter for <code>meta.meta_table.update_time</code>. 更新时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Getter for <code>meta.meta_table.creator</code>. 创建人
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * Setter for <code>meta.meta_table.creator</code>. 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Getter for <code>meta.meta_table.operator</code>. 更新人
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * Setter for <code>meta.meta_table.operator</code>. 更新人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * Getter for <code>meta.meta_table.table_name</code>. 表名
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for <code>meta.meta_table.table_name</code>. 表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter for <code>meta.meta_table.cn_name</code>. 表别名
     */
    public String getCnName() {
        return this.cnName;
    }

    /**
     * Setter for <code>meta.meta_table.cn_name</code>. 表别名
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    /**
     * Getter for <code>meta.meta_table.desc</code>. 描述信息
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * Setter for <code>meta.meta_table.desc</code>. 描述信息
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Getter for <code>meta.meta_table.namespace</code>. 空间唯一标识
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Setter for <code>meta.meta_table.namespace</code>. 空间唯一标识
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final MetaTable other = (MetaTable) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!createTime.equals(other.createTime))
            return false;
        if (updateTime == null) {
            if (other.updateTime != null)
                return false;
        }
        else if (!updateTime.equals(other.updateTime))
            return false;
        if (creator == null) {
            if (other.creator != null)
                return false;
        }
        else if (!creator.equals(other.creator))
            return false;
        if (operator == null) {
            if (other.operator != null)
                return false;
        }
        else if (!operator.equals(other.operator))
            return false;
        if (tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!tableName.equals(other.tableName))
            return false;
        if (cnName == null) {
            if (other.cnName != null)
                return false;
        }
        else if (!cnName.equals(other.cnName))
            return false;
        if (desc == null) {
            if (other.desc != null)
                return false;
        }
        else if (!desc.equals(other.desc))
            return false;
        if (namespace == null) {
            if (other.namespace != null)
                return false;
        }
        else if (!namespace.equals(other.namespace))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
        result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
        result = prime * result + ((this.creator == null) ? 0 : this.creator.hashCode());
        result = prime * result + ((this.operator == null) ? 0 : this.operator.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.cnName == null) ? 0 : this.cnName.hashCode());
        result = prime * result + ((this.desc == null) ? 0 : this.desc.hashCode());
        result = prime * result + ((this.namespace == null) ? 0 : this.namespace.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MetaTable (");

        sb.append(id);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(creator);
        sb.append(", ").append(operator);
        sb.append(", ").append(tableName);
        sb.append(", ").append(cnName);
        sb.append(", ").append(desc);
        sb.append(", ").append(namespace);

        sb.append(")");
        return sb.toString();
    }
}