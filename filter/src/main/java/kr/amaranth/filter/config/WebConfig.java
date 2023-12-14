package kr.amaranth.filter.config;

import kr.amaranth.filter.interceptor.OpenApiInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by KimKyungHo on 2023-12-13(013)
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private OpenApiInterceptor openApiInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(openApiInterceptor)
//                .addPathPatterns("/**");
    }
}
