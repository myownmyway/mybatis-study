package com.wpw.mybatisstudy.mapper;

import com.wpw.mybatisstudy.entity.Classes;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author wpw
 */
@Mapper
@Repository
public interface ClassesMapper {
    /**
     * 根据班级id查询班级信息
     *
     * @param id 班级id
     * @return 班级信息
     */
    Classes selectClasses(Integer id);

    /**
     * 根据班级id查询班级信息
     *
     * @param id 班级id
     * @return 班级信息
     */
    @Results({
            @Result(property = "id", column = "cid"),
            @Result(property = "name", column = "cname"),
            @Result(property = "teacher", column = "teacher_id", one = @One(select = "com.wpw.mybatisstudy.mapper.TeacherMapper.selectTeacherById"))
    })
    @Select(value = "select c.id cid,c.name cname,c.teacher_id teacher_id,t.id tid,t.name tname from classes c,teacher t where c.teacher_id=t.id and c.id=#{id}")
    Classes selectClassesByAnnotation(Integer id);

    /**
     * 根据班级id查询班级信息
     *
     * @param id 班级id
     * @return 班级信息
     */
    @SelectProvider(type = ClassesSqlProvider.class, method = "selectById")
    @Results(id = "resultMap", value = {
            @Result(property = "id", column = "cid"),
            @Result(property = "name", column = "cname"),
            @Result(property = "teacher", column = "teacher_id", one = @One(select = "com.wpw.mybatisstudy.mapper.TeacherMapper.selectTeacherById"))
    })
    Classes selectClassesByProvider(Integer id);

    /**
     * 根据班级id获取班级信息
     *
     * @param id 班级id
     * @return 班级信息(老师信息 ， 学生信息)
     */
    Classes getUserListByClassesId(Integer id);

    /**
     * 根据班级id获取班级信息
     *
     * @param id 班级id
     * @return 班级信息
     */
    Classes selectUserList(Integer id);
}
