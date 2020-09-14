package com.dineshkrish.cms.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(2)
public class MyFilter_1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter 1 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
    @Override
    public String toString() {
        return "MyFilter_1{}";
    }
    public MyFilter_1() {
        System.out.println(toString());
    }
}
