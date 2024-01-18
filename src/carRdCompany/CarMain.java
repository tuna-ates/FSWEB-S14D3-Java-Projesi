package carRdCompany;

public class CarMain {
    public static void main(String[] args) {
        CarSkeleton electricCar=new ElectricCar("Electric car","empty",
                12,500);
        electricCar.drive();
        electricCar.startEngine();
        ((ElectricCar)electricCar).methodTypes();
        System.out.println("**************************************");

        CarSkeleton gasCar=new GasPoweredCar("Gas car","empty",
                8,4);
        gasCar.drive();
        gasCar.startEngine();
        ((GasPoweredCar)gasCar).methodTypes();

        System.out.println("*************************************");

        CarSkeleton hybridCar=new HybridCar("Hybrid car","empty",
                15,300,5);
        hybridCar.drive();
        hybridCar.startEngine();
        ((HybridCar)hybridCar).methodTypes();


    }
}
