package Multithreading;

 class MyThreadA implements Runnable{

     @Override
     public void run() {
         for(int i=0; i<=10; i++){
             System.out.println("Value of i is" + i);
             try {
                 Thread.sleep(1000);
             }catch (Exception e){}
         }

     }

     public static void main(String[] args) {
         MyThreadA Thread =new MyThreadA();
         Thread.run();
     }
 }
