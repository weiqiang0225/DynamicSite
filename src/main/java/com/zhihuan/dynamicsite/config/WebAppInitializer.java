package com.zhihuan.dynamicsite.config;

import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        ConfigurableSiteMeshFilter siteMeshFilter=new ConfigurableSiteMeshFilter();
        return new Filter[]{siteMeshFilter};
    }
}
