package com.ruben.inmobiliaria.controller;

import java.util.List;
import java.util.Optional;

import com.ruben.inmobiliaria.model.House;
import com.ruben.inmobiliaria.service.HouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houses")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class HouseController {
    
    @Autowired
    private HouseService houseService;

    @GetMapping("/get")
    public List<House> getHouses(){
        return houseService.getHouses();
    }

    @GetMapping("/{id}")
    public House getHouseById(@PathVariable("id") Long id){
        Optional<House> house = houseService.getHouseById(id);
        if(house.isPresent()){
            return house.get();
        } 

        return new House();
    }

    @GetMapping("/state/{state}")
    public List<House> getByState(@PathVariable("state") String state){
        return houseService.getByState(state);
    }
    @GetMapping("/states")
    public List<String> getStates(){
        return houseService.getStates();
    }

}
