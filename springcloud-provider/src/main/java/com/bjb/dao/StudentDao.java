package com.bjb.dao;

import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentDao {

    public Student queryStudentById(Integer sId);
}
