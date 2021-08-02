package com.cloud.configserver.demo.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigChkController {

    private String prop;

    @GetMapping("/read")
    public String readProp(){
        return prop;
    }


}
