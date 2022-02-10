package Comparator;

public class User implements Comparable<User>{
    private String name;
    private int jobid;
    private int salary;

    public User(String name, int jobid, int salary) {
        this.name = name;
        this.jobid = jobid;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public int getJobid(){
        return jobid;
    }

    @Override
    public int compareTo(User o) {
        if (this.jobid == o.jobid){
            return 0;
        } else if(this.jobid<o.jobid){
            return -1;
        } else {
            return 1;
        }
    }
}
