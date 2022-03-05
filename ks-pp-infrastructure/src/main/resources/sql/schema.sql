create table account
(
    account_id       bigint auto_increment,
    corporation_name varchar(256) default '' not null,
    product_name     varchar(256) default '' not null,
    industry         varchar(256) default '' not null,
    phone            varchar(512) default '' not null,
    email            varchar(512) default '' not null,
    address          varchar(512) default '' not null,
    create_time      bigint       default 0  not null,
    update_time      bigint       default 0  not null,
    constraint account_account_id_uindex
        unique (account_id)
);

alter table account
    add primary key (account_id);

