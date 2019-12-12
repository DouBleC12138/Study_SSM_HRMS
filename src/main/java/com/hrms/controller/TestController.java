package com.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author GenshenWang.nomico
 * @date 2018/3/2.
 */
@Controller
public class TestController {
    /*
    两种方案：
    ①"/test"：这一种路径编写方式在最后访问test的页面时只要输入http://localhost:8080/test即可访问
    ②"/hrms/test"：这一种访问的地址为http://localhost:8080/hrms/test
    */
    @RequestMapping(value = "/test",  method = RequestMethod.GET)
    public String index(){
        System.out.println("测试。。。");
        return "main";
    }
}
