package com.example.demo;

import com.example.demo.services.SingletoneClasstest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.soap.MessageFactory;

@SpringBootApplication
public class DemoApplication {

	private Long number = 21L;
	public static void main(String[] args) {
		System.out.println(SingletoneClasstest.TEST_CONSTANT);
		SpringApplication.run(DemoApplication.class, args);

	}

	//Recursion example
//	private void recursion(){
//		number ++;
//		while (number<3500000L){
//			recursion();
//		}
//	}

}
