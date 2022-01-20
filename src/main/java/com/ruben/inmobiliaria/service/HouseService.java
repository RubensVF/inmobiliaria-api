package com.ruben.inmobiliaria.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import com.ruben.inmobiliaria.model.House;
import com.ruben.inmobiliaria.repository.HouseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseService {
    
    @Autowired
    private HouseRepository houseRepository;

    public List<House> getHouses(){
        return (List<House>) houseRepository.findAll();
    }

    public House saveHouse(House house){
        return houseRepository.save(house);
    }

    public Optional<House> getHouseById(Long id){
        return houseRepository.findById(id);
    }

    public List<House> getByState(String state){
        return houseRepository.findByState(state);
    }

    public List<String> getStates(){
        HashSet<String> hash = new HashSet<String>();
        List <House> houses = getHouses();
        for (House house : houses) {
            hash.add(house.getState());
        }
        return new ArrayList<String>(hash);
    }

}
