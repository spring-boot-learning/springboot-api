package com.spring.boot.controller;

import com.spring.boot.common.utils.I18nUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/name/{myName}", method = GET, produces = "application/json;charset=UTF-8")
    public String demo(@PathVariable String myName) {
        return I18nUtils.getMessage("hello.hello") + myName + "!!!";
    }
}
