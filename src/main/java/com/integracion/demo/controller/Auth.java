package com.integracion.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping(value = "/auth")
public class Auth {
    @GetMapping("/token")
    public ResponseEntity<Object> authToken(){
        return ResponseEntity.ok().body("Inicio de sesion exitosos");
    }
}
