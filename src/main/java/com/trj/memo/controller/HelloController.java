package com.trj.memo.controller;

import com.trj.memo.error.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public Object hello() throws Exception {
        throw new MyException("发生错误");
    }
}
