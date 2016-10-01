package com.dy.spring.setup.web;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic reg = servletContext.addServlet("front-controller",  DispatcherServlet.class);
        reg.setLoadOnStartup(1);
        reg.addMapping("/web/*");
    }
}
