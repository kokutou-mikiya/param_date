package com.spring.cn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode

@Data   //get/set/tostring
@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
@Builder

public class Student {

    private Integer id;
    private String name;
    private String sex;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:ss:mm.SSS")
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
