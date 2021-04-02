package com.bjb.controller;

import com.bjb.service.StudentService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/queryStudentById/{sId}")
    public Student queryStudentById(@PathVariable("sId") Integer sId) {
        return studentService.queryStudentById(sId);
    }

    @PostMapping("/addStudent")
    public int addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/discovery")
    public Object discovery() {
        //获取微服务列表
        List<String> services = client.getServices();
        System.out.println("discovery=>services:" + services);

        //得到一个具体的微服务信息，通过具体的微服务id，applicationName;
        List<ServiceInstance> instances = client.getInstances("springcloud-provider");

        for (ServiceInstance instance : instances) {
            System.out.println(
                instance.getHost() + "\t" +
                instance.getPort() + "\t" +
                instance.getUri() + "\t" +
                instance.getServiceId()
            );
        }
        return this.client;
    }

}