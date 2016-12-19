package com.github.chabanenk0.Entity;

import com.github.chabanenk0.Annotation.Use;

/**
 * Created by dmitry on 19.12.16.
 */
public class Car
{
    @Use
    private String color;

    @Use
    private int maxSpeed;

    @Use
    private String type;

    @Use
    private String model;

    private int yearOfProduction;

    private String country;

    public Car()
    {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
