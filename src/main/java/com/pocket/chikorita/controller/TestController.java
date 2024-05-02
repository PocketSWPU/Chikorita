package com.pocket.chikorita.controller;

import com.pocket.chikorita.mapper.TestMapperInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestMapperInt testMapperInt;
    @GetMapping("/t1")
    @ResponseBody
    public String test(){
        return "success";
    }

    @GetMapping("/t2")
    @ResponseBody
    public String test2(){
        return testMapperInt.testSql();
    }
}
