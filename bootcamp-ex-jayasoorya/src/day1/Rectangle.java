package day1;

public class Rectangle extends AbstractShape{
    int l = 2;
    int b = 5;
    @Override
    public double area() {
        return l*b;
    }
}
