package com.rest.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
    
    private final String [] CLASS_PATH_RESOURCE_LOCATION = {
        "classpath:/resources/assets/",
        "classpath:/resources/static",
        "classpath:/resources/templates"
    };

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
        .addResourceLocations(CLASS_PATH_RESOURCE_LOCATION);

    }
}
