package arraylistprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("mango");
        list.add("banana");
        list.add("Apple");
        list.add("Grapes");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //System.out.println(list);
    }
}
