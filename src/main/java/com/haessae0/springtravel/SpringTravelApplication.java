package com.haessae0.springtravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringTravelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTravelApplication.class, args);
    }

}
