package com.ali.wechat.dao;

import com.ali.wechat.po.Student;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Page<Student> search(@Param("name") String name, @Param("departmentId")Integer departmentId);

    void batchdelete(List<Integer> studentIds);
}