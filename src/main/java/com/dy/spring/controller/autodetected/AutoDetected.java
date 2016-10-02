package com.dy.spring.controller.autodetected;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AutoDetected {

    private @Autowired String name;

    @ResponseBody @RequestMapping(value = "/hi")
    public String sayHi() {
        return "Hi, " + name + "!";
    }
}
