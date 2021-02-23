package com.progrank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
