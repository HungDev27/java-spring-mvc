package com.hung.laptopshop.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class helloController {

    @GetMapping("/")
    public String index() {
        return "Hello Hưng";
    }

    @GetMapping("/user")
    public String userPage() {
        return "trang người dùng";
    }

    @GetMapping("/admin")
    public String adminrPage() {
        return "trang admin";
    }

}
