package com.github.chabanenk0;

import com.github.chabanenk0.Entity.Car;
import com.github.chabanenk0.Entity.Cat;
import com.github.chabanenk0.Entity.Engine;
import com.github.chabanenk0.Entity.Human;
import com.github.chabanenk0.Service.BeanRepresenter;
import com.github.chabanenk0.Service.CloneCreator;

import java.util.Iterator;
import java.util.Map;

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

        BeanRepresenter beanRepresenter = new BeanRepresenter();

        Map<String, String> catRepresentation = beanRepresenter.getBeanRepresentation(cat);
        printRepresentation(catRepresentation);

        Map<String, String> carRepresentation = beanRepresenter.getBeanRepresentation(car);
        printRepresentation(carRepresentation);

        Map<String, String> humanRepresentation = beanRepresenter.getBeanRepresentation(human);
        printRepresentation(humanRepresentation);

        Engine engine = new Engine();
        engine.setName("Zaporozhetz Z123");
        engine.setVolume(1.5);

        car.setEngine(engine);
        car.setDriver(human);
        System.out.println(car);

        CloneCreator cloneCreator = new CloneCreator();
        Car clonnedCar = null;
        try {
            clonnedCar = (Car) cloneCreator.clone(car);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        car.getEngine().setName("UpdatedZapor");
        car.getDriver().setLastName("NewDriver");
        System.out.println("Clonned car:");
        System.out.println(clonnedCar);
    }

    private static void printRepresentation(Map<String, String> representation)
    {
        Iterator iterator = representation.entrySet().iterator();
        System.out.println("\nField\tValue");
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }
    }
}
