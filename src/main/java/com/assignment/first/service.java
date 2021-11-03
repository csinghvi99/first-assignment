package com.assignment.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

@Autowired
repository Repository;
public  boolean search_num(long msisdn) {

    entity Entity =this.Repository.findByphone(msisdn);
    if (Entity !=null){
        if (Entity.getPhone() == msisdn) {
            return true;
        }
    }

    return false;
}

}
