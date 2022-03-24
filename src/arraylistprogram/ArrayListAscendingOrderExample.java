package arraylistprogram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAscendingOrderExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(22);
        list.add(25);
        list.add(28);
        list.add(55);
        list.add(50);
        list.add(44);
        list.add(55);

        System.out.println("before short numbers......."+list);
        Collections.sort(list);


        System.out.println("After short number.........."+list);
        Collections.sort(list
        );

    }
}
