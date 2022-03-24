package Set;

import java.util.HashSet;

public class HasSet {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<String>();
        hs.add("java");
        hs.add("python");
        hs.add("c++");
        hs.add("c");
        System.out.println("before Adding duplicate and null values:");
        System.out.println(hs);

        hs.add("python");
        hs.add("c");
        System.out.println("After Adding duplicate values:");
        System.out.println(hs);

        hs.add("null");
        hs.add("null");
        System.out.println("After Adding null values:");
        System.out.println(hs);
    }
}
