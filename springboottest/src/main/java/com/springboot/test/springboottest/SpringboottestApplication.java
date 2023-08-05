package com.springboot.test.springboottest;

import com.springboot.test.springboottest.service.SomeBusinessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringboottestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringboottestApplication.class, args);
		SomeBusinessService someBusinessService = configurableApplicationContext.getBean(SomeBusinessService.class);
		int sum = someBusinessService.addSum(new int[]{1, 2, 3});
		System.out.println(sum);
	}

}
