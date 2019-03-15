package com.logicbig.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.logicbig.example"})
@TestPropertySource("classpath:test.properties")
public class ReportServiceTests {
    @Autowired
    private ReportService reportService;

    @Test
    public void testReportSubscriber() {
        String s = reportService.getReportSubscriber();
        System.out.println(s);
        Assert.assertEquals("theDeveloper2@example.com", s);
    }
}