package Constructor;

public class SuperKeyword {
    SuperKeyword(){
//        super();
        System.out.println("this is keyword");
    }
}

class subclass extends SuperKeyword{
    subclass(){

        System.out.println("this is subclass");
    }
}

class mains extends subclass{
    public static void main(String[] args) {
        subclass s1= new subclass();
    }
}
