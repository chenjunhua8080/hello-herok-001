package com.example.helloherok001;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${hello}")
    private String hello;

    @GetMapping("/test/001")
    public Map<String, Object> test001() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("data", "hello heroku! - " + hello);
        return map;
    }
}
