package Multithreading;

public class IntroToMultithreading extends Thread{
    public static void main(String[] args) throws InterruptedException {


        IntroToMultithreading Thread1=new IntroToMultithreading();
        Thread1.setName("Ramesh");


        IntroToMultithreading Thread2=new IntroToMultithreading();
        Thread2.setName("Suresh");

        IntroToMultithreading Thread3=new IntroToMultithreading();
        Thread3.setName("Kamlesh");

        Thread1.start();


        Thread2.start();

        Thread3.start();




    }

    @Override
    public void run() {


        synchronized (IntroToMultithreading.this){
            for(int i=0; i<3; i++){
                System.out.println("Inside run() method" + Thread.currentThread().getName() + "and index is" + i);

                try{
                    Thread.sleep(40000);

                }catch (InterruptedException e ){
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
