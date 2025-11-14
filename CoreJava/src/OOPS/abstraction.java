package OOPS;

abstract class abstraction {
    public abstract void m1();
}

class subclass extends abstraction{
    @Override
    public void m1() {
        System.out.println("m1 is super class method");
    }
}

class Main extends subclass{
    public static void main(String[] args) {
        subclass op=new subclass();
        op.m1();
    }
}