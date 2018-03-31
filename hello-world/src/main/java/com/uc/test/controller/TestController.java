package com.uc.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: uc
 * Date: 2018-03-31
 * Time: 10:49
 * Desc:
 */
@RestController
@RequestMapping(value = {"/test"})
public class TestController {

    /**
     * 回声测试
     * @param msg
     * @return
     */
    @GetMapping(value = {"/echo"})
    public String echo(@RequestParam(value = "msg") String msg) {
        return msg;
    }
}
