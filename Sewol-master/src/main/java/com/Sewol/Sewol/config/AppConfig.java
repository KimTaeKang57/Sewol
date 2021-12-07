package com.Sewol.Sewol.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebListener
@Configuration
public class AppConfig implements HttpSessionListener {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
