create table if not exists `classes`
(
    id         int(11) auto_increment primary key comment '班级id',
    name       varchar(255) not null comment '班级名称',
    teacher_id int(11)
) engine = InnoDb
  charset = utf8;