package day1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5};
        int[][] arr2d ={{1,2,3},{4,5,6}};
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println("Array : " + Arrays.toString(arr));

        System.out.println("2d array : " + Arrays.deepToString(arr2d));

        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add Elements
        list.add(0);
        list.add(2);
        list.add(4);

        System.out.println("ArrayList : " + list);

        //get element
        int element = list.get(1);
        System.out.println(element);

        list.add(1,5);
        System.out.println("ModifiedArrayList : " + list);
    }
}
