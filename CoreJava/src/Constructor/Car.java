package Constructor;

public class Car {
    private String name;
    private int num;

    public Car(){
         this("bmw",122334);
        System.out.println("CAr is on the way");
    }
    private Car(String name,int num){
        this.name=name;
        this.num=num;
        System.out.println("Super car in market");
    }
}
class main{
    public static void main(String[] args) {
        Car Bmw= new Car();
//        Car c1= new Car("bmw",122334);
    }
}