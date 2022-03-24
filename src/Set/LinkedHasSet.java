package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Amit");
        set.add("Shivam");
        set.add("Dinky");
        set.add("Dinesh");
        set.add("Amit");//LinkedHasSet does not contain duplicate value
        set.add("null");//LinkedHasSet Allow one null value

        //Traverse LinkedHasSet
        Iterator <String>iterator=set.iterator();
        while (iterator.hasNext()) {
            System.out.println(""+iterator.next());
        }
        //get size
        System.out.println("size:"+set.size());
    }
}
