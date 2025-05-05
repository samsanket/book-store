package com.labs.order_service.controller;

import com.labs.order_service.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;

@RestController
public class TestController implements Comparator {

    @Autowired
    TestService.DemoService demoService;


    public static void main(String[] args) {


        Pageable pageable = PageRequest.of();

    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
