package carRdCompany;

public class CarSkeleton   {
     private String name;
     private  String description;


     public CarSkeleton(String name, String description) {
          this.name = name;
          this.description = description;
     }

     public String getName() {
          return name;
     }

     public String getDescription() {
          return description;
     }

     public void startEngine(){
          System.out.println("engine is starting");
     }

     public void drive(){
          runEngine();
          System.out.println("engine is driving");
     }

     protected void runEngine(){
          System.out.println("engine is run");
     }
}

