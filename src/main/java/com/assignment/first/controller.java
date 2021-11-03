package com.assignment.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private service service;

    @RequestMapping("/user/{msisdn}")
    public boolean searchNum(@PathVariable("msisdn") long msisdn){
        return service.search_num(msisdn);
    }
}
