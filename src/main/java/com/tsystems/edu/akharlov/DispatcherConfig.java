package com.tsystems.edu.akharlov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
*
* Replaces dispatcher-servlet.xml file
* */
@Configuration
@ComponentScan({"com.tsystems.edu.akharlov"})
public class DispatcherConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        //view.setPrefix("/WEB-INF/");
        view.setSuffix(".jsp");
        return view;
    }
}
