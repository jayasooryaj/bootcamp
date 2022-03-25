package day1;

public class StringManipulation {
    public static void main(String arg[]){
        String str1 = "hello";
        String str2 = "world";
        String helloWorld = str1.concat(str2);


        System.out.println(helloWorld);
        System.out.println(helloWorld.length());
        System.out.println(helloWorld.contains("world"));
        System.out.println(helloWorld.substring(5,8));

        StringBuilder sB = new StringBuilder();
        sB.append(helloWorld);

        System.out.println(sB.reverse());


    }
}
