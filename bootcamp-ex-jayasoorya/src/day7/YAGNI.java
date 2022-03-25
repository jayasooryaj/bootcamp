package day7;

//Program to find area of a circle. Method to find area of Rectangle is not needed right now

public class YAGNI {
    public static void main(String arg[]){

        System.out.println(areaCircle(5));

    }
    static double areaCircle(int r){
        return 3.14*r*r;
    }

    //isn't needed right now
    double areaRect(int l, int b){
        return l*b;
    }

}
