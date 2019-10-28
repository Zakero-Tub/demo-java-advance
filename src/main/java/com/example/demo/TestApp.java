package com.example.demo;

import com.example.demo.services.SingletoneClasstest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApp {

	private Long number = 21L;
	public static void main(String[] args) {
		System.out.println(SingletoneClasstest.TEST_CONSTANT);
		SpringApplication.run(TestApp.class, args);

	}

	//Recursion example
//	private void recursion(){
//		number ++;
//		while (number<3500000L){
//			recursion();
//		}
//	}

}
