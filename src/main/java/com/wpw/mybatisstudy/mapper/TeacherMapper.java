package com.wpw.mybatisstudy.mapper;

import com.wpw.mybatisstudy.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author wpw
 */
@Mapper
@Repository
public interface TeacherMapper {
    /**
     * 根据教师id查询教师信息
     *
     * @param id 教师id
     * @return teacher信息
     */
    @Select(value="select * from teacher where id=#{id}")
    Teacher selectTeacherById(Integer id);
}
