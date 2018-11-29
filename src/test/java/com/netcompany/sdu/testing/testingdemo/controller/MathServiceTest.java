package com.netcompany.sdu.testing.testingdemo.controller;

import com.netcompany.sdu.testing.testingdemo.TestingDemoApplication;
import com.netcompany.sdu.testing.testingdemo.service.MathService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by mrr on 27/11/2018.
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestingDemoApplication.class)
@SpringBootTest
public class MathServiceTest {

    @Autowired
    private MathService mathService;

    @Test
    public void testAddition() {

    }
}