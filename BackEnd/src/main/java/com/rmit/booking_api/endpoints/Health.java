package com.rmit.booking_api.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

    @RequestMapping("/halo")
    public String hello_world() {
        return "Halo Dunia";
    }
}
