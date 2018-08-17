package com.gpg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping("index")
    public String index(String urlName) {
        return urlName;
    }
}
