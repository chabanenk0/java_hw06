package com.github.chabanenk0.Entity;

/**
 * Created by dmitry on 21.12.16.
 */
public class Engine
{
    private String name;

    private double volume;

    private long serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String toString()
    {
        return "Engine name: " + this.getName() + "Serial#" + this.getSerialNumber()
                + "(" + this.getVolume() + "m3)\n";
    }
}
