package day1;

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }



    public boolean equals(Coordinate c){
        if(this == c){
            return true;
        }
        if(c == null){
            return false;
        }
        if(this.x == c.x && this.y == c.y){
            return true;
        }
        return false;
    }
}

public class CompareObjects {


    public static void main(String[] arg){

        Coordinate c1 = new Coordinate(2,3);
        Coordinate c2 = new Coordinate(4,5);
        Coordinate c3 = new Coordinate(2,3);

        System.out.println(c1);
        System.out.println(c3);

        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 == c3: " + (c1 == c3));
        System.out.println("c1.equals(c2): " + (c1.equals(c2)));
        System.out.println("c1.equals(c3): " + (c1.equals(c3)));

    }
}
