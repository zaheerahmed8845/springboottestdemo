package com.springboot.test.springboottest.service;

import com.springboot.test.springboottest.data.SomeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeBusinessServiceImpl implements SomeBusinessService {

    @Autowired
    private SomeDataService someDataService;

    @Override
    public int addSumUsingDataService() {
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for (int values : data) {
            sum += values;
        }
        return sum;
    }

    @Override
    public int addSum(int[] data) {
        int sum = 0;
        for (int values : data) {
            sum += values;
        }
        return sum;
    }
}
