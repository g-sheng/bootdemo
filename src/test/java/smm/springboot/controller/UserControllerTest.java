package smm.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import smm.springboot.Application;
import smm.springboot.dto.UserDTO;
import smm.springboot.service.impl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserControllerTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void test1(){
       UserDTO user= userService.find(1);
       System.out.println("userName="+user.getUsername());
    }
}
