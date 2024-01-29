package mondai13.mondai13_1;

public class Cook extends Person {
    private String specialties;
    private String name;
    private String job;

    public Cook(String name, String job, String specialties) {
        super(name, job);
        this.specialties = specialties;
    }


    @Override public void introduce(){
        System.out.println("氏名："+super.getName());
        System.out.println("職業："+super.getJob());
        System.out.println("得意料理："+this.specialties);
    }
}
