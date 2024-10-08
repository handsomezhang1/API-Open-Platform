package com.shuai.yuapiinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * YuApi 模拟接口入口类
 * 可以进行后续的AI接口接入

 */
@SpringBootApplication
public class YuapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuapiInterfaceApplication.class, args);}

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route("tobaidu", r -> r.path("/baidu")
//                        .uri("https://www.baidu.com"))
//                .build();
//    }
}

