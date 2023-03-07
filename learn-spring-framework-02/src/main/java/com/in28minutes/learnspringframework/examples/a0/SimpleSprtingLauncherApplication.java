package com.in28minutes.learnspringframework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class yourBusinessClass{
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}


@Configuration
@ComponentScan
public class SimpleSprtingLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (var context = new AnnotationConfigApplicationContext(SimpleSprtingLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
