package com.ruben.inmobiliaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String state;
    private String adress;
    private Long price;
    private int rooms;
    private int baths;
    private int area;
    private String slug;
    private String img;

    public House(){}
    public House(String state, String adress, Long price, int rooms, int baths, int area, String slug, String img) {
        this.state = state;
        this.adress = adress;
        this.price = price;
        this.rooms = rooms;
        this.baths = baths;
        this.area = area;
        this.slug = slug;
        this.img = img;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public int getBaths() {
        return baths;
    }
    public void setBaths(int baths) {
        this.baths = baths;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }



    





}
