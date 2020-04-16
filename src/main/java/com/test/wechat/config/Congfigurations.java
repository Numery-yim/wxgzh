package com.test.wechat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/12 18:01
 * @content
 */
@Configuration
public class Congfigurations {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
