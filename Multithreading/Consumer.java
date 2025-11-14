package Multithreading;

public class Consumer extends Thread{
    CompanyA c;
    Consumer(CompanyA c){
        this.c=c;

    }
    public void run(){
        int i=1;
        while (true){
            this.c.Consumer_item(i);
            try {
                Thread.sleep(1000);

            }catch (Exception e){

            }
        }
    }
}
