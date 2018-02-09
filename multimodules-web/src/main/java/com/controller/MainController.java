package com.controller;

import com.dao.CoreTableRepository;
import com.entities.CoreTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private CoreTableRepository repo2;

    @RequestMapping("/")
    public ResponseEntity<?> helloWorld() {


        CoreTable data = repo2.findOne(1L);
        System.out.println(data.getId());
        System.out.println(data.getValue());

        return new ResponseEntity<>("Hello World!!!", HttpStatus.OK);
    }
}
