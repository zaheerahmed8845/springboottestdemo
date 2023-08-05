package com.springboot.test.springboottest.service.mock;

import com.springboot.test.springboottest.data.SomeDataService;
import com.springboot.test.springboottest.service.SomeBusinessServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class SomeBusinessServiceMockitoExtTest {

    @InjectMocks
    private SomeBusinessServiceImpl someBusinessService;

    @Mock
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
