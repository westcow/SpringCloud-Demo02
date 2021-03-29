package com.bjb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
@Configuration
public class configBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
