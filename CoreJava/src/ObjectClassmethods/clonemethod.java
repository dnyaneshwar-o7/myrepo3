package ObjectClassmethods;

public class clonemethod implements Cloneable {
    int id;
    String name;

    public clonemethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }

    @Override
    public String toString() {
        return "clonemethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class ExampleCloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        clonemethod s1 =new clonemethod(101,"ram");
        clonemethod s2=(clonemethod) s1.clone();

        System.out.println("orginal" +s1);
        System.out.println("cloned"+s2);
    }
}
