package day2;

import java.io.*;

class Serialized implements Serializable {
    public int a;
    public String b;

    public Serialized(int a, String b) {
        this.a = a;
        this.b = b;
    }

}

public class SerializationExample {
    public static void main(String[] args) {
        Serialized object = new Serialized(1, "helloworld");
        String filename = "file.ser";


        try {

            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);


            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }


        Serialized object1 = null;

        // Deserialization
        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (Serialized) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}