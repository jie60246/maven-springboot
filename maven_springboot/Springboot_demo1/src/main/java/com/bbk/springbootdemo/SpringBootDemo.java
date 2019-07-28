package com.bbk.springbootdemo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication  //(scanBasePackages = "com.bbk")  //注明这是一个Springboot项目,扫描这个包下的所有项目
@MapperScan("com.bbk.dao")  //指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
@ComponentScan(basePackages = {"com.bbk"})
public class SpringBootDemo {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo.class,args);   //Springboot启动
        System.out.println("hello,springboot");
    }
}
