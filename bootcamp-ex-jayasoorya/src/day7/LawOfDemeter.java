package day7;

public class LawOfDemeterInJava
{
    private Topping cheeseTopping;
    public void goodExamples(Pizza pizza)
    {
        Foo foo = new Foo();
        // it's okay to call own methods
        doSomething();

        // (2) it's okay to call methods on objects passed in to our method
        int price = pizza.getPrice();

        // (3) it's okay to call methods on any objects we create
        cheeseTopping = new CheeseTopping();
        float weight = cheeseTopping.getWeightUsed();

        // (4) any directly held component objects
        foo.doBar();
    }

    private void doSomething()
    {
        // do something here ...
    }
}

//  bad example
//  objectA.getObjectB().getObjectC().doSomething();