package com.bbk;

import com.bbk.entity.User;
import com.bbk.service.UserService;
import com.bbk.springbootdemo.SpringBootDemo;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)    //1
@SpringBootTest(classes= SpringBootDemo.class)  //2
public class demoTest {

    @Autowired
    private UserService userService;

    @Test       //3
    public void queryAllUser() throws Exception{
        List<User> users = userService.queryUser();
        System.out.println(users);
//        return user;
    }
}
