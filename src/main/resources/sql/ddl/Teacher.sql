create database study;
use study;
create table if not exists `teacher`
(
    id   int(11) auto_increment primary key comment '班级id',
    name varchar(255) not null comment '班级名称'
) engine = InnoDb charset =utf8;