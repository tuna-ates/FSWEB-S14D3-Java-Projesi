package carRdCompany;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description,
                         double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
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
