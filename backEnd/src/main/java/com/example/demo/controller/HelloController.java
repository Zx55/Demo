package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api")

public class HelloController {
    @GetMapping(value = "studentMan")
    public String getStudentManList() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        return id;
    }

    @GetMapping(value = "studentWoman")
    public List<Student> getStudentWomanList() {
        Student stu4 = new Student(4, "stu4", "female");
        Student stu5 = new Student(5, "stu5", "female");
        Student stu6 = new Student(6, "stu6", "female");
        List<Student> list2 = new ArrayList<>();
        list2.add(stu4);
        list2.add(stu5);
        list2.add(stu6);
        return list2;
    }

}
