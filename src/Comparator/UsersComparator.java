package Comparator;

import java.util.Comparator;

public class UsersComparator implements Comparator<User> {

    @Override
    public int compare(User obj1, User obj2) {
        if (obj1.getSalary() == obj2.getSalary()){
            return 0;
        } else if(obj1.getSalary()<obj2.getSalary()){
            return -1;
        } else {
            return 1;
        }
    }
}
