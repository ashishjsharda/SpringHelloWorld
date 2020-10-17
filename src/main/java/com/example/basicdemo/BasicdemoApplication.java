package com.example.basicdemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Example using SpringBootApplication
 * @author ashis
 */
@SpringBootApplication
@RestController
public class BasicdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicdemoApplication.class, args);
    }

    @RequestMapping(value = "/hello")
    public String hello()
    {
        return "Hello World";
    }

}
