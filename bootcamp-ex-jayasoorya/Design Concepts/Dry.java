package day7;

public class Dry {
    public void person1()
    {
        System.out.println("Jayasoorya");
        bank();
    }

    public void person2()
    {
        System.out.println("Janaki");
        bank();
    }

    public void bank()
    {
        System.out.println("SBI");
    }

    public static void main(String[] args)
    {


        Dry s = new Dry();

        s.person1();
        s.person2();
    }
}
