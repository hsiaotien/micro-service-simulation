package com.dev.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }

    //RestTemplate默认是JDK原生的URLConnection
    // 这次我们使用了OkHttp客户端,只需要注入工厂即可
    @Bean
    public RestTemplate restTemplate() {//需要被spring管理
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
