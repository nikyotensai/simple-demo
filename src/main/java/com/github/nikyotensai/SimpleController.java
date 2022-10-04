package com.github.nikyotensai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
public class SimpleController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @GetMapping(value = "/get")
    public String get() {
        return "Hello world!";
    }

    @PostMapping(value = "/returnReq")
    public String returnReq(@RequestBody(required = false) String req) {
        return req;
    }


}
