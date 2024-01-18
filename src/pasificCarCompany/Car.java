package pasificCarCompany;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private  int wheels;

    public Car(int cylinders, String name) {

        this.cylinders = cylinders;
        this.name = name;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void setEngine() {
        this.engine = true;
    }

    public void setWheels() {
        this.wheels = 4;
    }
    public void startEngine(){
        System.out.println("the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    public void accelerate(){
        System.out.println("the car is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    public void brake(){
        System.out.println("the car is braking");
        System.out.println(getClass().getSimpleName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
