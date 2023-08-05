package com.springboot.test.springboottest.service.spring.runner;

import com.springboot.test.springboottest.data.SomeDataService;
import com.springboot.test.springboottest.service.SomeBusinessService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import(ApplicationTestConfiguration.class)
public class SomeBusinessServiceSpringExtTest {
    @Autowired
    private SomeBusinessService someBusinessService;

    @MockBean
    private SomeDataService someDataService;

    @BeforeEach
    public void before() {
        Mockito.lenient().when(someDataService.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
    }

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
