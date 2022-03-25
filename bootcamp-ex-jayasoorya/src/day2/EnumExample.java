package day2;

public class EnumExample {
    enum Size{
        SMALL("The size is small."),
        MEDIUM("The size is medium."),
        LARGE("The size is large."),
        EXTRALARGE("The size is extra large.");

        private final String pizzaSize;

        // private enum constructor
        private Size(String pizzaSize) {
            this.pizzaSize = pizzaSize;
        }

        public String getSize() {
            return pizzaSize;
        }
    }

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String arg[]){
        Level heat = Level.MEDIUM;
        System.out.println(heat);

        Size pizza = Size.SMALL;
        System.out.println(pizza.getSize());
    }
}
