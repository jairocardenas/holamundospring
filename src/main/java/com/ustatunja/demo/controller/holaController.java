package com.ustatunja.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaController {

    @RequestMapping(value = {"/index", "/", "/home"})
    public String holamundo() {
        return "Hola chrismo jajaja, ¿puedo dormir?, toy cansainguis jajaj";
    }

}
