package com.giapnt.shoppingcart.postgresql.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.giapnt.shoppingcart.postgresql.services.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtAuthenticationTokenFilter extends UsernamePasswordAuthenticationFilter {
    private final static String TOKEN_HEADER = "authorization";

    @Autowired
    private JwtService jwtService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String authToken = httpRequest.getHeader(TOKEN_HEADER);
        if (authToken != null) {
            if (jwtService.validateTokenLogin(authToken)) {
                String username = jwtService.getUsernameFromToken(authToken);
                HttpSession session = httpRequest.getSession();
                session.setAttribute("usernameLogin", username);
            }
        }
        chain.doFilter(request, response);
    }
}
