package com.ali.wechat.controller;

import com.ali.wechat.po.Student;
import com.ali.wechat.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@EnableAutoConfiguration
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/search")
    public PageInfo<Student> search(@RequestParam(required = false) String name,
                                    @RequestParam(required = false) Integer departmentId,
                                    @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,5);
        Page<Student> studentPage = studentService.search(name, departmentId);
        PageInfo<Student> studentPageInfo = studentPage.toPageInfo();
        return studentPageInfo;
    }

    @PostMapping("/add")
    private int add(@RequestBody Student student){
        int i = studentService.add(student);
        return i;
    }
    @PostMapping("/upd")
    private void update(@RequestBody Student student){
        studentService.update(student);
    }
    @PostMapping("/del")
    private void delete(@RequestParam Integer studentId){
        studentService.delete(studentId);
    }
    @PostMapping("/batchdelete")
    private void batchdelete(@RequestParam List<Integer> studentIds){
        studentService.batchdelete(studentIds);
    }


}
