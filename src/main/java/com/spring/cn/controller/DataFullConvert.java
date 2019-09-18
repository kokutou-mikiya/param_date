package com.spring.cn.controller;

import com.spring.cn.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//设置日期的全局转换
@RestController
public class DataFullConvert {

    @GetMapping("stu01")
    public Student student(){

        Student student =  Student.builder().id(1).name("张三").sex("男").birthday(new Date()).build();

        return student;
        //在配置文件中添加：spring.jackson.date-format=yyyy-MM-dd
        //得到json数据： "birthday": "2019-09-17"    成功转换

    }

    @GetMapping("param")
    public String param(Student student){
        System.out.println(student);
        return "success";
    }

}
