package day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] arg){
        HashSet<String> h = new HashSet<String>();
        h.add("First");
        h.add("Second");
        h.add("Third");
        h.add("Forth");

        System.out.println(h);
        System.out.println(h.contains("Fifth"));

        HashSet<Integer> secondSet = new HashSet<Integer>();
        secondSet.add(4);
        secondSet.add(2);
        secondSet.add(8);
        secondSet.add(3);
        secondSet.add(5);

        Iterator<Integer> it = secondSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(5);

        Iterator<Integer> it2 = treeSet.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
