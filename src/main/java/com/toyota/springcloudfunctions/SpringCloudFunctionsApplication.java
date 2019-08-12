package com.toyota.springcloudfunctions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudFunctionsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionsApplication.class, args);
    }

    @Bean
    public Function<String,String> reverseString(){
        return value -> new StringBuilder(value).reverse().toString();
    }
}
