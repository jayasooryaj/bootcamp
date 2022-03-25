package day1;

import java.util.Arrays;
import java.util.List;

public class MyStream {
    public static void main(String[] args)
    {


        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        list.stream().filter(num -> num % 5 == 0).forEach(num -> System.out.println(num));
    }
}
