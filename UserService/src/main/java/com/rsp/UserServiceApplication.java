package com.rsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }


    @GetMapping("/greetings")
    public String greetings(){
        return "Your work setup is running good...";
    }

    @GetMapping("/users")
    public List<User> loadUsers(){
        return Stream.of(new User(1, "Ted", "ted@gmail.com"),
                new User(2, "Ted", "ted@gmail.com"),
                new User(3, "Ted", "ted@gmail.com"),
                new User(4, "Ted", "ted@gmail.com")).collect(Collectors.toList());
    }
}
