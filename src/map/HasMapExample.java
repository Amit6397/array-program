package map;

import java.util.HashMap;

public class HasMapExample {

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("amit",23);
        hm.put("shivam",27);
        hm.put("sumit",21);
        hm.put("keshav",19);
        System.out.println("before Adding duplicate key:");
        System.out.println(hm);

        hm.put("shivam",25);
        hm.put("keshav",19);
        System.out.println("After Adding duplicate key:");
        System.out.println(hm);
    }
}
