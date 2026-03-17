create table user
(
    id     int auto_increment comment '主键'
        primary key,
    name   varchar(10)      not null comment '姓名',
    age    int              null comment '年龄',
    status char default '1' null comment '状态',
    gender char             null comment '性别',
    constraint name
        unique (name),
    check ((`age` > 0) and (`age` <= 120))
)
    comment '用户表';

INSERT INTO test.user (id, name, age, status, gender) VALUES (1, 'Tom', 19, '1', '男');
INSERT INTO test.user (id, name, age, status, gender) VALUES (2, 'jack', 19, '0', '女');
