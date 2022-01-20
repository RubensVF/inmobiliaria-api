package com.ruben.inmobiliaria.repository;

import java.util.List;

import com.ruben.inmobiliaria.model.House;

import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends CrudRepository<House,Long> {
    List<House> findByState(String state);
}
