package com.java8features.understandinglambdas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
interface Calculator{
    int sum (int a, int b);
}
@SpringBootApplication
public class UnderstandingLambdasApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnderstandingLambdasApplication.class, args);
//        Calculator calculator = () -> {System.out.println("Turn on the calculator");};
//        calculator.switchOn();
            Calculator calculator = ( firstNum, secondNum) -> {
                int sum = (firstNum + secondNum);
                return sum;
            };
            System.out.println("The sum of the two numbers is " +calculator.sum(15,30));
    }

}
