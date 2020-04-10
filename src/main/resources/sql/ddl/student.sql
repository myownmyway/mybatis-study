create table if not exists `student`
(
    id         int(11) auto_increment primary key comment '学生id',
    name       varchar(255) not null comment '学生姓名',
    classes_id int(11)
) engine = InnoDb
  charset = utf8;
insert into  student(name,classes_id) values('student_A',1);
insert into  student(name,classes_id) values('student_B',1);
insert into  student(name,classes_id) values('student_C',1);
insert into  student(name,classes_id) values('student_D',2);
insert into  student(name,classes_id) values('student_E',2);
insert into  student(name,classes_id) values('student_F',2);