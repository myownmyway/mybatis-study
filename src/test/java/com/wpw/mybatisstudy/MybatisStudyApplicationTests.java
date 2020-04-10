package com.wpw.mybatisstudy;

import com.wpw.mybatisstudy.entity.Classes;
import com.wpw.mybatisstudy.mapper.ClassesMapper;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisStudyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ClassesMapper classesMapper;

    @Test
    @Ignore
    public void selectClasses() {
        Classes classes = classesMapper.selectClasses(1);
        System.out.println("classes = " + classes);
    }

    @Test
    @Ignore
    public void selectClassesByAnnotation() {
        Classes classes = classesMapper.selectClassesByAnnotation(1);
        System.out.println("classes = " + classes);
    }

    @Test
    @Ignore
    public void selectClassesByProvider() {
        Classes classes = classesMapper.selectClassesByProvider(1);
        System.out.println("classes = " + classes);
    }

    @Test
    @Ignore
    public void selectClassesBySecond() {
        Classes classes = classesMapper.selectClasses(1);
        System.out.println("classes = " + classes);
    }

    @Test
    @Ignore
    public void getStudentListByClassesId() {
        Classes classes = classesMapper.getUserListByClassesId(1);
        System.out.println("classes = " + classes);
    }

    @Test
    @Ignore
    public void getStudentList() {
        Classes classes = classesMapper.selectUserList(1);
        System.out.println("classes = " + classes);
    }
}
