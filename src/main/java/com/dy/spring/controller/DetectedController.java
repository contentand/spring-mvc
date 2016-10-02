package com.dy.spring.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* DEPRECATED: very bad way of declaring Controllers */
/* the Controller part will be thrown away. Url: /detected */
public class DetectedController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("Yes! You detected me!");
        return null;
    }
}
