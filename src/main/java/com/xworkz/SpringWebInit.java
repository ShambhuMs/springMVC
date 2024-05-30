package com.xworkz;

import com.xworkz.config.PrimaryConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWeb extends AbstractAnnotationConfigDispatcherServletInitializer {
    public SpringWeb() {
        System.out.println("Runnig no arg constr........");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running getRootConfigClasses........ ");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Running getServletConfigClasses....... ");
        return new Class[]{PrimaryConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Running getServletMappings");
        return new String[0];
    }
}
