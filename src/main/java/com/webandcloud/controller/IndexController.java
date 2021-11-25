package com.webandcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Java Developer Zone on 19-07-2017.
 */
@RestController
public class IndexController {
    @RequestMapping("/test")
    public String index() {
        return "Spring Boot Example";
    }
}
