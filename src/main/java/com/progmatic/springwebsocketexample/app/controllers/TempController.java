package com.progmatic.springwebsocketexample.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TempController {

    @GetMapping("/hello")
    public @ResponseBody String getHello() {
        return "Hello valak mass";
    }

    @GetMapping("/socket-demo")
    public String getSocket() {
        return "socket";
    }
}
