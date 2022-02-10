package Comparator;

import java.util.Comparator;

public class UsersJobidComparator implements Comparator<User> {

    @Override
    public int compare(User obj1, User obj2) {
        if (obj1.getJobid() == obj2.getJobid()){
            return 0;
        } else if(obj1.getJobid()<obj2.getJobid()){
            return -1;
        } else {
            return 1;
        }
    }
}
