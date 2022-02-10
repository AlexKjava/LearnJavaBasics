package Comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CreateUsers {
    public static void main(String[] args) {
        User userone=new User("Ivan",1,10000);
        User usertwo=new User("Anna",2,7000);

        //System.out.println(userone.compareTo(usertwo));
        Comparator<User> userComparator = new UsersComparator();
        Comparator<User> userJobidComparator = new UsersJobidComparator();

        Map<User,String> map = new TreeMap<>(userComparator.thenComparing(userJobidComparator).thenComparing(User::getName));
        map.put(userone,"boss");
        map.put(usertwo,"programmer");

        for(Map.Entry<User,String> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
