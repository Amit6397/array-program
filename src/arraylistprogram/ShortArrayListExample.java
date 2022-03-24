package arraylistprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShortArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("amit");
        list1.add("Shivam");
        list1.add("sumit");
        list1.add("keshav");
        //Collections.sort(list1);

        System.out.println("before short numbers......."+list1);
        Collections.sort(list1);


        System.out.println("After short number.........."+list1);
        Collections.sort(list1);




    }
}
