package com.bjb.controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
@RestController
public class StudentConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/selectStudentById/{sId}")
    public Student selectStudentById(@PathVariable("sId") Integer sId) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/queryStudentById/" + sId, Student.class);
    }

    @RequestMapping("/insertStudent")
    public Integer insertStudent(Student student) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/student/addStudent", student, Integer.class);
    }







}
