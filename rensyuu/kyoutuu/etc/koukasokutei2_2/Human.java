package etc.koukasokutei2_2;

public class Human {
    protected String name;    // 名前
  protected int age;        // 年齢

  // コンストラクタ定義
    public Human(String name, int age) {
    this.name = name;
    this.age = age;

    public void greeting() {
        System.out.println("Hello.");
        }
    
      // 自己紹介するメソッド
        public void introduction() {
        // 挨拶する
        greeting();
        // 名前と年齢を表示する
        System.out.println("私は、" + this.name + "です。");
        System.out.println("年齢は、" + this.age + "です。");
        }
    }
    
    }


