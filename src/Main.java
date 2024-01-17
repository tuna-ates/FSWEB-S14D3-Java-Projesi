import PasificCarCompany.Car;
import PasificCarCompany.Ford;
import PasificCarCompany.Mitsubishi;

public class Main {
    public static void main(String[] args) {

  /*  Car car=new Car(4,"merco");
    car.startEngine();
        System.out.println("**************************");

        Car mitsubishi=new Mitsubishi(5,"L200");
        mitsubishi.startEngine();*/

        Car car = new Car(8, "Base car");

        car.startEngine();
        car.accelerate();
        car.brake();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Car ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }




}