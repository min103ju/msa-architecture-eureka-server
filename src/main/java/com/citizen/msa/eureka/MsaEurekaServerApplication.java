package com.citizen.msa.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaEurekaServerApplication.class, args);

        git remote add origin https://github.com/min103ju/msa-architecture-eureka-server.git
    }
}
