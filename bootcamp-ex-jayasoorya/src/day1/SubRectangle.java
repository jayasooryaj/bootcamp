package day1;

public class SubRectangle extends Rectangle{
    public static void main(String arg[]){
        System.out.println("Multi Level Inheritance");
        sum(1,2);
        sum(1,2,3);
    }

    private static void sum(int x, int y){
        System.out.println(x+y);
    }
    private static void sum(int x, int y, int z){
        System.out.println(x+y+z);
    }
}
