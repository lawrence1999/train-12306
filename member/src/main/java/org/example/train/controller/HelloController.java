package org.example.train.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Date: 2024/4/8
 * Author: lawrence
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello111";
    }
}
