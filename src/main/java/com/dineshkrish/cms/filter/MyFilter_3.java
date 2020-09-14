package com.dineshkrish.cms.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(4)
public class MyFilter_3 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter 3 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public String toString() {
        return "MyFilter_3{}";
    }
    public MyFilter_3() {
        System.out.println(toString());
    }
}
