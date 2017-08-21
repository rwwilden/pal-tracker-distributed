package io.pivotal.pal.tracker.oauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.pivotal.pal.tracker.oauthserver")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
