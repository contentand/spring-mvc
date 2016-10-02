package com.dy.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("Interceptor#preHandle: request from: " + request.getRemoteAddr());
        System.out.println("Interceptor#preHandle: handler: " + handler);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("Interceptor#postHandle: mav: " + modelAndView);
        System.out.println("Interceptor#postHandle: handler: " + handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) throws Exception {
        System.out.println("Interceptor#afterCompletion: exception: " + ex);
        System.out.println("Interceptor#afterCompletion: handler: " + handler);
    }
}
