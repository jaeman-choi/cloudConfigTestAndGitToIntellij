package com.cloud.configserver.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // EnableConfigServer annotation을 하나 추가하면, config 서버로 구동가능케 함.
public class DemoApplication {

    public static void main(String[] args) {
        // 변경점 테스트
        System.out.println("chk?");
        SpringApplication.run(DemoApplication.class, args);
    }

}
