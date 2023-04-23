package com.java8features.understandinglambdas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
interface Calculator{
    void switchOn();
}
@SpringBootApplication
public class UnderstandingLambdasApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnderstandingLambdasApplication.class, args);
        Calculator calculator = () -> {System.out.println("Turn on the calculator");};
        calculator.switchOn();
    }

}
