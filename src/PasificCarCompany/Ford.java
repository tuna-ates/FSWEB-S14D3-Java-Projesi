package PasificCarCompany;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
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
