package com.ali.wechat.dao;

import com.ali.wechat.po.DepartmentTeacherKey;

public interface DepartmentTeacherMapper {
    int deleteByPrimaryKey(DepartmentTeacherKey key);

    int insert(DepartmentTeacherKey record);

    int insertSelective(DepartmentTeacherKey record);
}