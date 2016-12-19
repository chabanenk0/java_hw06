package com.github.chabanenk0.Entity;

import com.github.chabanenk0.Annotation.Use;

/**
 * Created by dmitry on 19.12.16.
 */
public class Human
{
    private String firstName;

    private String lastName;

    @Use
    private char gender;

    @Use
    private int age;

    @Use
    private float heigth;

    @Use
    private float weight;

    public Human()
    {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
