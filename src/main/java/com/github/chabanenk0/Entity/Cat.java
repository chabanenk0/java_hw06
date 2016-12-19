package com.github.chabanenk0.Entity;

import com.github.chabanenk0.Annotation.Use;

/**
 * Cat class
 * @Entity
 */
public class Cat
{
    private String name;

    @Use
    private String color;

    @Use
    private int age;

    @Use
    private int legCount;

    @Use
    private float fullLength;

    public Cat()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public float getFullLength() {
        return fullLength;
    }

    public void setFullLength(float fullLength) {
        this.fullLength = fullLength;
    }
}
