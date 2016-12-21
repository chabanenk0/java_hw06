package com.github.chabanenk0.Entity;

import com.github.chabanenk0.Annotation.Clone;
import com.github.chabanenk0.Annotation.Compare;
import com.github.chabanenk0.Annotation.Use;

/**
 * Created by dmitry on 19.12.16.
 */
public class Car
{
    @Use
    @Compare
    private String color;

    @Use
    @Compare
    private int maxSpeed;

    @Use
    private String type;

    @Use
    @Compare
    private String model;

    @Compare
    private int yearOfProduction;

    private String country;

    @Clone
    private Engine engine;

    @Clone
    private Human driver;

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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Human getDriver() {
        return driver;
    }

    public void setDriver(Human driver) {
        this.driver = driver;
    }

    public String toString()
    {
        return "Car:\n Model:" + this.getModel() + "\n Type:" +  this.getType()
                + " \n Color:" + this.getColor() + "\n Country:" + this.getCountry()
                + " \n Engine:" + this.getEngine() + " Driver:" + this.getDriver() + "\n";
    }
}
