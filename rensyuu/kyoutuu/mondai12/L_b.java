package mondai12;

public class L_b {
    // 人の基本的な情報を管理する Person クラス
    public static void main(String[] args) {
        // 教師のインスタンス生成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go 言語");

        // コックのインスタンス生成
        Cook cook = new Cook("沖田総司", "コック", "オムライス");

        // 教師の情報表示
        System.out.println("=== 教師の情報 ===");
        teacher.introduce();
        System.out.println();

        // コックの情報表示
        System.out.println("=== コックの情報 ===");
        cook.introduce();
    }
}


class Person {
    private String name;
    private String job;

    // コンストラクタ
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // 情報を表示するメソッド
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
    }
}

// 教師の情報を管理する Teacher クラス
class Teacher extends Person {
    
    private String subject;

    // コンストラクタ
    // public Teacher(String name, String subject) {
    //     // 親クラスのコンストラクタを呼び出す
    //     super(name, "教員");
    //     this.subject = subject;
    // }
    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    // 情報を表示するメソッド（オーバーライド）
    @Override
    public void introduce() {
        super.introduce();  // 親クラスの introduce メソッドを呼び出す
        System.out.println("担当科目：" + subject);
    }
}

// コックの情報を管理する Cook クラス
class Cook extends Person {
    private String speciality;

    // コンストラクタ
    // public Cook(String name, String speciality) {
    //     // 親クラスのコンストラクタを呼び出す
    //     super(name, "シェフ");
    //     this.speciality = speciality;
    // }
    public Cook(String name, String job, String speciality) {
        super(name, job);
        this.speciality = speciality;
    }
    
    // 情報を表示するメソッド（オーバーライド）
    @Override
    public void introduce() {
        super.introduce();  // 親クラスの introduce メソッドを呼び出す
        System.out.println("得意料理：" + speciality);
    }

}
