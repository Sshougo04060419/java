package mondai13.mondai13_1;

// 抽象（abstract）クラス
public abstract class Person {
    // フィールド
    private String name;
    private String job;

    // コンストラクタ
    public Person (String name, String job){
        this.name = name;
        this.job = job;
    }

    // 抽象（abstract）メソッド
    public abstract void introduce(); 

    // ゲッター
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

}