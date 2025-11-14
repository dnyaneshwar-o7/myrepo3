package Multithreading;

import Methodsecondjava.Main;

class polygon{
   public void Display(){
        System.out.println("Display the Polygon");
    }
}

 class AnonymousDemo {
    public void CreateClass(){

        polygon p1=new polygon(){
            public void Displsy() {
            System.out.println("Display the inner class");
        }
    };
        p1.Display();
}
}

class Main_{
    public static void main(String[] args) {
      AnonymousDemo d1= new AnonymousDemo();

        d1.CreateClass();
    }
}