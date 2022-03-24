package arraylistprogram;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Mango");
        al.add("Banana");
        al.add("Apple");

        System.out.println("Returning element:"+al.get(1));
       // al.set(1,"Dates");
      //  System.out.println("final:");
        for (String fruit:al)
        System.out.println(fruit);
    }
}
