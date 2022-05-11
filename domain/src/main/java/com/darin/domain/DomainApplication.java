package com.darin.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DomainApplication {

    public static void main(String[] args) {
        try {

            SpringApplication.run(DomainApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
