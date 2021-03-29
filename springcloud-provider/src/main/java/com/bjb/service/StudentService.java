package com.bjb.service;

import entity.Student;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
public interface StudentService {

    public Student queryStudentById(Integer sId);

    public int addStudent(Student student);
}
