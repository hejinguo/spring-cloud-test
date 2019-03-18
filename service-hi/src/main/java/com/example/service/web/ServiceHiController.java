package com.example.service.web;

import com.example.service.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceHiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "hesy") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @PostMapping("/get")
    public User get(@RequestBody User user) {
        return new User(user.getName() !=null ? user.getName()+"":"*", user.getAge() != null ? user.getAge() * 10 : 7);
    }
}
