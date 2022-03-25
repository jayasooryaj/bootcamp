package day1;

import java.util.LinkedList;

public class LL {

    public static void main(String[] arg){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);

        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.remove(3);
        System.out.println(list);
        for (String s : list) {
            System.out.print(s + " -> ");
        }
        System.out.println("null");
    }
}
