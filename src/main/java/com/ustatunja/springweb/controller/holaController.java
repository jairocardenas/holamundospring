package com.ustatunja.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class holaController {

    @GetMapping(value = {"/index", "/", "/home"})
    public String index(){
        return "index";
    }

}
