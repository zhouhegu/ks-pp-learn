CREATE SCHEMA if not exists `meta`;
SET SCHEMA `meta`;

CREATE TABLE `meta_table`
(
    `id`   bigint(20)      NOT NULL AUTO_INCREMENT COMMENT '主键',
    `create_time`   bigint(20)      default 0 not null comment '创建时间',
    `update_time`   bigint(20)      default 0 not null comment '更新时间',
    `creator`   varchar(128)      default '' not null comment '创建人',
    `operator`   varchar(128)      default '' not null comment '更新人',
    `table_name`   varchar(64)      default '' not null comment '表名',
    `cn_name`   varchar(64)      default '' comment '表别名',
    `desc`   varchar(512)      default '' comment '描述信息',
    `namespace`   varchar(64)      default '' not null comment '空间唯一标识',
    PRIMARY KEY (`id`)
);

CREATE TABLE `meta_field`
(
    `id`   bigint(20)      NOT NULL AUTO_INCREMENT COMMENT '主键',
    `table_id`   bigint(20)      default 0 not null comment '关联的表ID',
    `name`   varchar(128)      default '' not null comment '字段名称',
    `type`   varchar(64)      default '' comment '字段类型',
    `comment`   varchar(256)      default '' comment '字段描述',
    `nullable`   tinyint(4)      default 0 not null comment '是否可空',
    PRIMARY KEY (`id`)
);

CREATE TABLE `meta_row`
(
    `id`   bigint(20)      NOT NULL AUTO_INCREMENT COMMENT '主键',
    `create_time`   bigint(20)      default 0 not null comment '创建时间',
    `update_time`   bigint(20)      default 0 not null comment '更新时间',
    `creator`   varchar(128)      default '' not null comment '创建人',
    `operator`   varchar(128)      default '' not null comment '更新人',
    `table_id`   bigint(20)      default 0 not null comment '关联的表ID',
    PRIMARY KEY (`id`)
);

CREATE TABLE `meta_data`
(
    `id`   bigint(20)      NOT NULL AUTO_INCREMENT COMMENT '主键',
    `row_id`   bigint(20)      default 0 not null comment '行ID',
    `field_id`   bigint(20)      default 0 not null comment '字段ID',
    `field_value`   varchar(256)      default '' not null comment '字段值',
    `deleted` tinyint(4)      default 0 not null comment '是否删除',
    PRIMARY KEY (`id`)
);