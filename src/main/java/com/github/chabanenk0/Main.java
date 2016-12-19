package com.github.chabanenk0;

import com.github.chabanenk0.Entity.Car;
import com.github.chabanenk0.Entity.Cat;
import com.github.chabanenk0.Entity.Human;

/**
 * Created by dmitry on 19.12.16.
 */
public class Main
{
    private static Car createCar()
    {
        Car car = new Car();
        car.setColor("Blue");
        car.setCountry("Ukraine");
        car.setMaxSpeed(150);
        car.setModel("Skoda Octavia");
        car.setType("Carcar");
        car.setYearOfProduction(2010);

        return car;
    }

    private static Cat createCat()
    {
        Cat cat = new Cat();
        cat.setAge(3);
        cat.setName("Murzik");
        cat.setColor("Black");
        cat.setFullLength(356);
        cat.setLegCount(4);

        return cat;
    }

    private static Human createHuman()
    {
        Human human = new Human();
        human.setFirstName("Ivan");
        human.setLastName("Ivanov");
        human.setAge(34);
        human.setGender('m');
        human.setHeigth(184);
        human.setWeight(79);

        return human;
    }
    public static void main(String[] args) {
        Cat cat = createCat();
        System.out.println("Cat:" + cat.toString());
        Car car = createCar();
        System.out.println("Car:" + car.toString());
        Human human = createHuman();
        System.out.println("Human:" + human.toString());

        System.out.println("Hello world");
    }
}
