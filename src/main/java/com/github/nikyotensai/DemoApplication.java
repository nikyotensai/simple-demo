package com.github.nikyotensai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class DemoApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(DemoApplication.class, args);
        Environment env = application.getEnvironment();
        log.info("server started.docUrl:http://localhost:{}/doc.html", env.getProperty("server.port"));
    }

}
