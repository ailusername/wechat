package com.ali.wechat.service.impl;

import com.ali.wechat.dao.StudentMapper;
import com.ali.wechat.po.Student;
import com.ali.wechat.service.StudentService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableAutoConfiguration
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Page<Student> search(String name, Integer departmentId) {
        return studentMapper.search(name,departmentId);
    }

    @Override
    public  int add(Student student) {
        int i = studentMapper.insert(student);
        return i;
    }

    @Override
    public void update(Student student) {
        studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public void delete(Integer studentId) {
        studentMapper.deleteByPrimaryKey(studentId);
    }

    @Override
    public void batchdelete(List<Integer> studentIds) {
        studentMapper.batchdelete(studentIds);
    }
}
