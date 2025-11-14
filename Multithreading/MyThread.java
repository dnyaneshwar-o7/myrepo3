package Multithreading;

public class MyThread  extends Thread {

    String task;

    MyThread (String task) {
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(task + " :" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyThread Th1 = new MyThread("Cut the ticket");
        MyThread Th2= new MyThread("Show your seat number");

        Thread t1=new Thread(Th1);
        Thread t2=new Thread(Th2);

        t1.start();
        t2.start();
    }
}
