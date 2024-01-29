package mondai13.mondai13_1;

    // 子クラス（継承元：Person）
public class Teacher extends Person {
    private String subject;
    private String name;
    private String job;

    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;        
    }


    @Override public void introduce(){
        System.out.println("氏名："+super.getName());
        System.out.println("職業："+super.getJob());
        System.out.println("担当科目："+this.subject);
    }
}


