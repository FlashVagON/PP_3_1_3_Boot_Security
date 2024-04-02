package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserServiceImpl;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

//	public static UserServiceImpl userService;
//
//    public SpringBootSecurityDemoApplication(UserServiceImpl userService) {
//        this.userService = userService;
//    }


    public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);

//        userService.addUser(new User("user1", "us1", 44, "123"));
	}

}
