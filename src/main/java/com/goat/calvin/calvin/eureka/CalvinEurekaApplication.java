package com.goat.calvin.calvin.eureka;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xiefei15
 */
@SpringBootApplication
@EnableEurekaServer
@EnableApolloConfig
public class CalvinEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalvinEurekaApplication.class, args);
    }

}
