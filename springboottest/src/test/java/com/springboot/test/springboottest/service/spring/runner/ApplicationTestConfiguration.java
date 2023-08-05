package com.springboot.test.springboottest.service.spring.runner;

import com.springboot.test.springboottest.data.SomeDataService;
import com.springboot.test.springboottest.data.SomeDataServiceImpl;
import com.springboot.test.springboottest.service.SomeBusinessService;
import com.springboot.test.springboottest.service.SomeBusinessServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class ApplicationTestConfiguration {

    @Bean
    public SomeDataService getSomeDataService() {
        return new SomeDataServiceImpl();
    }

    @Bean
    public SomeBusinessService getSomeBusinessService() {
        return new SomeBusinessServiceImpl();
    }
}
