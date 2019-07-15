package com.ali.wechat.service;

import com.ali.wechat.po.Student;
import com.github.pagehelper.Page;

import java.util.List;

public interface StudentService {

    Page<Student> search(String name, Integer departmentId);

    int add(Student student);

    void update(Student student);

    void delete(Integer studentId);

    void batchdelete(List<Integer> studentIds);
}
