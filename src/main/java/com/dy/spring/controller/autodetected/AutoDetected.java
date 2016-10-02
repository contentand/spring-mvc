package com.dy.spring.controller.autodetected;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    // By Presence of query parameter
    @ResponseBody @RequestMapping(path = "/hi", params={"from"})
    public String sayHiFrom(@RequestParam String from) {
        return "Hi, " + name + "!<br>From " + from;
    }

    // By Presence of particular value in a particular parameter
    @ResponseBody @RequestMapping(path = "/hi", params = {"from", "user=friend"})
    public String sayHiFromDearFriend(@RequestParam String from) {
        return "Hi, " + name + "!<br>From my dear " + from;
    }

    // By Presence/Value of particular header (EVALUATED AFTER PARAMETERS!!!)
    @ResponseBody @RequestMapping(path="/hi", headers = {"from", "type=fantastic"})
    public String sayHiViaHeader() {
        return "Oh, hi! You are so clever!";
    }
}
