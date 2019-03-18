package com.example.feign.service;

import com.example.feign.entity.User;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + (name == null ? "*" : name) + ", shutdown!!!";
    }

    @Override
    public User getUser(User user) {
        return new User("-99",99);
    }
}
