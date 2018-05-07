package com.controller;

import com.dao.CoreTableRepository;
import com.entities.CoreTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private CoreTableRepository repo2;

    @RequestMapping("/")
    public ResponseEntity<?> helloWorld() {
        // test

        CoreTable data = repo2.findOne(1L);
        System.out.println(data.getId());
        System.out.println(data.getValue());
        logger.info("\n==>    ID : " + data.getId() + "\n==> value : " + data.getValue());

        return new ResponseEntity<>("A message from server side.", HttpStatus.OK);
    }
}
