package com.assignment.first;

import org.springframework.data.repository.CrudRepository;

public interface repository extends CrudRepository <entity, Integer> {

    public entity findByphone(long msisdn);


}
