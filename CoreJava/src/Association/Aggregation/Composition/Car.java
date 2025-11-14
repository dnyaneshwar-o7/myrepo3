package Association.Aggregation.Composition;

 class Car {
    private final Engine engine;
    String nameofcar;
    int modell;

     public Car( String nameofcar, int modell) {

         engine=new Engine("cdmjm","mfmjm");
         this.nameofcar = nameofcar;
         this.modell = modell;
     }

     public void showalldetails(){
         System.out.println("Name of car"+nameofcar);
         System.out.println("Name of model"+modell);
         System.out.println();
     }
 }
class Engine{
    String typeofEngine;
    String nameofEngine;

    public Engine(String typeofEngine, String nameofEngine) {
        this.typeofEngine = typeofEngine;
        this.nameofEngine = nameofEngine;
    }
}
class showroom{
    public static void main(String[] args) {
        Engine engine=new Engine("fmmfk","dkejmj");
        Car car =new Car("Bmw",454);
          car.showalldetails();
    }

}