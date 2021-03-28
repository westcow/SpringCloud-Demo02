package com.bjb.service.impl;

import com.bjb.dao.StudentDao;
import com.bjb.service.StudentService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student queryStudentById(Integer sId) {
        return studentDao.queryStudentById(sId);
    }
}
