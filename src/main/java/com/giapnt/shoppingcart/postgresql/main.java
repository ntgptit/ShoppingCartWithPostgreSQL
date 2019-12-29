package com.giapnt.shoppingcart.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class main {

    /**
     * Main.
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(main.class, args);

    }
}
