package org.example.member;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


/**
 * Description:
 * Date: 2024/4/8
 * Author: lawrence
 */
@SpringBootApplication
@MapperScan("org.example.member.mapper")
public class MemberApplication {
    public static final Logger log = LoggerFactory.getLogger(MemberApplication.class);
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MemberApplication.class);
        Environment environment = application.run(args).getEnvironment();
        log.info("MemberApplication start success,http://127.0.0.1:{}", environment.getProperty("server.port"));

    }
}
