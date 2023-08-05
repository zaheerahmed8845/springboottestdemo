package com.springboot.test.springboottest.data;

import org.springframework.stereotype.Repository;

@Repository
public class SomeDataServiceImpl implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        System.out.println("Inside SomeDataService Class");
        return new int[]{1, 2, 3};
    }
}
