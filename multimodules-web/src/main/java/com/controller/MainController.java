package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
	
    @RequestMapping("/")
    public ResponseEntity<?> helloWorld() {

        ResponseEntity<String> responseEntity = new ResponseEntity<>("Hello World!!!", HttpStatus.OK);

        return responseEntity;
    }
}
