package com.spring.cn.controller;

import com.spring.cn.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DataConvert {

    @GetMapping("stu")
    public Student student(){
        //通过builder方式 设置属性值
        Student student =  Student.builder().id(1).name("张山").sex("男").birthday(new Date()).build();
        //返回 student 对象
        return student;
        //student对象 被jackson 转换了
        //请求http://localhost:8080/stu即可得到json数据

        /**
         *  返回的birthday： "birthday": "2019-09-17T15:09:34.159+0000"
         *  在实体类 birthday 属性上添加注解  @JsonFormat(pattern = "yyyy-MM-dd HH:ss:mm.SSS")
         *  得到json数据中birthday :  "birthday": "2019-09-17 15:07:25.515"  成功转换
         *  因为我们返回的是对象  被jackson转换了  用到了jackson  所有可以采用 @JsonFormat注解
         *  注意：只能针对一个属性  每一个需要转换的属性 都需要添加注解
         */

    }
}
