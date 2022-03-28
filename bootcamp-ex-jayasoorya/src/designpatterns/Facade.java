package designpatterns;

public class Facade {
    public static  void main(String arg[]){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}

interface  Shape{
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class ShapeMaker{
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
