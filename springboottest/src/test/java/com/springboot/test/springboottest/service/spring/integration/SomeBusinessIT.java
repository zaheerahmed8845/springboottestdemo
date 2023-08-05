package com.springboot.test.springboottest.service.spring.integration;

import com.springboot.test.springboottest.data.SomeDataService;
import com.springboot.test.springboottest.service.SomeBusinessService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class SomeBusinessIT {
    @Autowired
    private SomeBusinessService someBusinessService;

    @Autowired
    private SomeDataService someDataService;

    @Test
    public void testSum() {
        int actualSum = someBusinessService.addSum(new int[]{1, 2, 3});
        int expSum = 6;
        Assertions.assertEquals(actualSum, expSum);
    }

    @Test
    public void testSumWithDataService() {
        int actualSum = someBusinessService.addSumUsingDataService();
        int expSum = 6;
        Assertions.assertEquals(actualSum, expSum);
    }
}
