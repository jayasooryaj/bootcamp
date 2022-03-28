package designpatterns;

public class Singleton {
    public static void main(String arg[]){

        SingleDemo obj1 = SingleDemo.getInstance();
        SingleDemo obj2 = SingleDemo.getInstance();

        System.out.println(obj1.equals(obj2));

    }
}

class SingleDemo{
    static SingleDemo obj = new SingleDemo();

    private SingleDemo(){

    }

    public static SingleDemo getInstance(){
        return obj;
    }
}