package Multithreading;

public class Company {
    int n;

     synchronized public void produce_item(int n) {
        this.n = n;
        System.out.println("Produce item " + this.n);
    }

    synchronized public int Consumer_item(int n){
        this.n=n;
        System.out.println("Consumer item" + this.n);
        return this.n;
    }
}

