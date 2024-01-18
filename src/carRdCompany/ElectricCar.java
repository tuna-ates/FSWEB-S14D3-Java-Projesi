package carRdCompany;

public class ElectricCar extends  CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description,
                       double avgKmPerCharge,int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("engine "+super.getName()+" is starting");
    }

    @Override
    public void drive() {
        super.runEngine();
        System.out.println("engine "+super.getName()+" is driving");
    }
    public void methodTypes(){
        System.out.println("class type: "+getClass().getSimpleName());
    }
}
