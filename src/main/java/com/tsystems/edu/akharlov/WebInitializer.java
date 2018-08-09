package com.tsystems.edu.akharlov;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//Replaces web.xml file
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {DispatcherConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
