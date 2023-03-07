package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class RealWorldSprtingLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (var context = new AnnotationConfigApplicationContext(RealWorldSprtingLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//			System.out.println(context.getBean(YourBusinessClass.class));
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}
