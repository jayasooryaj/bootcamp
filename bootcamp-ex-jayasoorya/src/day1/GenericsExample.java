package day1;

import java.util.*;

    public class GenericsExample {
        public static void main(String[] args) {

            // Approach 1
            List<Object> list1 = new ArrayList<>();
            list1.add("Jayasoorya");
            list1.add(100);
            list1.add(true);

            // Approach 2
            List<MyWrapper> list2 = new ArrayList<>();
            list2.add(new MyWrapper("Jithendra"));
            list2.add(new MyWrapper(1));
            list2.add(new MyWrapper(34.5));
        }
    }

    class MyWrapper {

        private String name;
        private Integer number;
        private Double money;

        public MyWrapper(String name)
        {
            this.name = name;
        }

        public MyWrapper(Integer num)
        {
            this.number = num;
        }

        public MyWrapper(Double money)
        {
            this.money = money;
        }
    }
