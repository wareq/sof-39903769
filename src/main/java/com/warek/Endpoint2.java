package com.warek;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test", produces = "application/v2")
public class Endpoint2 {

    @RequestMapping(method = RequestMethod.PUT)
    public void put() {
    }

}
