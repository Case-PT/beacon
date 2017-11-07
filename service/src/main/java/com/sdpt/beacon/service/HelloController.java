package com.sdpt.beacon.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "Mr./Ms. No Name") String name,
                        @RequestParam(value = "color", required = false, defaultValue = "black") String color,
                        Map<String, Object> model) {
        model.put("color", color);
        model.put("name", name);
        return "hello";
    }
}