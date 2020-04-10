insert into classes(name, teacher_id)
values ("class_a", 1);
insert into classes(name, teacher_id)
values ("class_b", 2);
##补加外键关联
alter table classes ADD constraint fk_teacher_id FOREIGN KEY (teacher_id) REFERENCES teacher (id);##添加外键约束
alter table  classes drop constraint fk_teacher_id ;##删除外键约束