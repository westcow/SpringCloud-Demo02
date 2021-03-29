package com.bjb.controller;

import com.bjb.service.StudentService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/queryStudentById/{sId}")
    public Student queryStudentById(@PathVariable("sId") Integer sId) {
        return studentService.queryStudentById(sId);
    }

    @PostMapping("/addStudent")
    public int addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

}