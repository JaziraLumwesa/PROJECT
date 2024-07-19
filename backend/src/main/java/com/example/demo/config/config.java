package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class config {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Disable CSRF for testing purposes
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/api/v1/location/**").permitAll() // Allow unauthenticated access to these endpoints
                        .anyRequest().authenticated()
                );
        return http.build();
    }
}
