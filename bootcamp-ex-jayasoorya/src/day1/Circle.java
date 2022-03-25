package day1;

public class Circle implements Shape{

    int radius = 2;

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
