package br.com.douglas.config;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class AuthFailureHandler extends SimpleUrlAuthenticationFailureHandler{
	
}
