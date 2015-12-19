package com.crap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrapController {

    @RequestMapping(path = "/hello")
    public Hello hello() {
        return new Hello("Hi There!");
    }
}
