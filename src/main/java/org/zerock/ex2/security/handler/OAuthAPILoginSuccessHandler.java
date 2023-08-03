package org.zerock.ex2.security.handler;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class OAuthAPILoginSuccessHandler implements AuthenticationSuccessHandler{

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {


        log.info("OAuth onAuthenticationSuccess.................");
        log.info("OAuth onAuthenticationSuccess.................");
        log.info("OAuth onAuthenticationSuccess.................");
        log.info("OAuth onAuthenticationSuccess.................");
        log.info("OAuth onAuthenticationSuccess.................");

    }

}
