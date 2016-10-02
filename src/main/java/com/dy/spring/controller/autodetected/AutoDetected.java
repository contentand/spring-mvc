package com.dy.spring.controller.autodetected;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AutoDetected {

    private @Autowired String name;

    @ResponseBody @RequestMapping(value = "/hi")
    public String sayHi() {
        return "Hi, " + name + "!";
    }

    //By HTTP method for any UNMAPPED request. Note! /get is not url is a name!
    @ResponseBody @RequestMapping(name = "/get", method = RequestMethod.GET)
    public String get() {
        return "Here you go!";
    }
}
