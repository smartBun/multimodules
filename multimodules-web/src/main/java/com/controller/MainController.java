package com.controller;

import com.dao.TestTableRepository;
import com.entities.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private TestTableRepository repo;

    @RequestMapping("/")
    public ResponseEntity<?> helloWorld() {

        ResponseEntity<String> responseEntity = new ResponseEntity<>("Hello World!!!", HttpStatus.OK);

        TestTable data = repo.findOne(1L);
        List<TestTable> ids = repo.findAll();
        List<TestTable> data2 = repo.findDataByValue("456");
        System.out.println(data);
        System.out.println(ids);
        System.out.println(data2);


        return responseEntity;
    }
}
