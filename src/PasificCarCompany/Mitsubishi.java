package PasificCarCompany;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("the "+super.getName()+" engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("the "+super.getName()+" is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("the "+super.getName()+" is braking");
    }
}
