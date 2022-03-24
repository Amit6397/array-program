package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(1,"Amit");
        map.put(2,"Shivam");
        map.put(3,"Dinky");
        map.put(4,"Dinesh");
        map.put(5,"Hirdhesh");

        map.put(5,"Amit");
        map.put(6,"Hitesh kumar");

        //traverse LinkedHasMap
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println("key:"+entry.getKey()+",Value:"+entry.getValue());
        }
        //get value by key
        System.out.println("particular key:"+map.get(5));
    }
}
