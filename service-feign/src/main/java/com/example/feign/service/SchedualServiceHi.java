package com.example.feign.service;

import com.example.feign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name",defaultValue = "niull") String name);

    @RequestMapping("/get")
    User getUser(@RequestBody User user);
}
