package Multithreading;

public class Threadop {
    public static void main(String[] args) {
        System.out.println("Program is Starting.....");
        int x= 100+25;
        System.out.println("Addition of x is" + x);

        Thread t =Thread.currentThread();
        String tname= t.getName();
        System.out.println("current running thread is " + tname);
          t.setName("Myanme");
          try{
              Thread.sleep(5000);
          }catch (Exception e){

          };

        System.out.println(t.getName());
        System.out.println("Program ended...");

    }
}
