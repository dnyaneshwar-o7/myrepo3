package Multithreading;


class CompanyA {    //Producer-Consumer Logic
    int n;

    synchronized public void produce_item(int n) {//It is Synchronized Method
        this.n = n;          // no of item
        System.out.println("Produce item " + this.n);
    }

    synchronized public int Consumer_item(int n){ //It is also synchronized Method
        this.n=n;    // no of item
        System.out.println("Consumer item" + this.n);
        return this.n;
    }
}
 class ProducerA extends Thread{ //It is Producer thread

    CompanyA c;

    ProducerA(CompanyA c){
        this.c=c;
    }

    public void run() {
        int i=1;
        while (true){
            this.c.produce_item(i);
            try {


                Thread.sleep(1000);
            }catch (Exception e){

            }
            i++;
        }
    }
}
 class ConsumerA extends Thread{
    CompanyA c;
    ConsumerA(CompanyA c){
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

public class Main {
    public static void main(String[] args) {
        CompanyA comp=new CompanyA();
        ProducerA p=new ProducerA(comp);
        ConsumerA c=new ConsumerA(comp);
        p.start();
        c.start();
    }
}
