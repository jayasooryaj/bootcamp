package day2;

public class NestedClassExample {
    static int x = 10;
    int y = 20;

    class InnerClass {
        private void print(){
            System.out.println(x + " " + y);
        }
    }
    static class InnerStaticClass {
        private void print(){
            System.out.println(x);
        }
    }
}
