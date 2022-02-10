package Iterator;

import java.util.*;

public class Iter {
    public static void main(String[] args) {
/*-----------------SET-----------------*/
        Set<String> set = new TreeSet<>();

        set.add("Test1");
        set.add("Test2");
        set.add("Test3");
        set.add("Test1");
        set.add("Test5");

        for (String s : set){
            System.out.println(s);
        }
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
/*------------------MAP-----------------*/
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"TEST");
        map.put(2,"DONE");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry);
        }

        Iterator<Map.Entry<Integer,String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,String> entry = iter.next();
            System.out.println("key: "+entry.getKey() + "; value: " + entry.getValue());
        }
    }
}
