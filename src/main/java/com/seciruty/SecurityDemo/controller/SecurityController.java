package com.seciruty.SecurityDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/health")
    public ResponseEntity<String> getHealth()
    {
        return  new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/health1")
    public ResponseEntity<String> getHealth1()
    {
        return  new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}
