package org.example.member.common;

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
public class CommonApplication {
    public static final Logger log = LoggerFactory.getLogger(CommonApplication.class);
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CommonApplication.class);
        Environment environment = application.run(args).getEnvironment();
        log.info("MemberApplication start success,http://127.0.0.1:{}", environment.getProperty("server.port"));

    }
}
