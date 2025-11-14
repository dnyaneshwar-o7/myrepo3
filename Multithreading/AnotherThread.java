package Multithreading;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Value of i is " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e ){

            }
        }
        start();
    }


    public static void main(String[] args) {

        MyThreadA th= new MyThreadA();

        Thread td=new Thread(th);

        //AnotherThread Object

        AnotherThread ths=new AnotherThread();
        ths.run();
    }

}
