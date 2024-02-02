package etc.koukasokutei2_2;

public class Japanese extends Human {   //////////////////////////////////////////////////////////////
    // フィールド定義
    protected String nation = "日本人"; //国籍

    public Japanese(String name, int age) {
        // 親クラスのコンストラクタを呼び出して名前と年齢を設定する
        super(name, age);
        }
    
      // メソッド定義
      // 挨拶を表示するメソッド（オーバーライド）
        public void greeting () {///////////////////////////////////////////////////////
        // 日本語の挨拶をする
        System.out.println("こんにちは");
        }
    
      // 自己紹介するメソッド（オーバーライド）
        public void introduction() {
        // 親クラスのintroductionメソッドを呼び出す
        super.introduction();///////////////////////////////////////////////////////////////
        // 国籍を表示する
        System.out.println(this.nation + "です。");
        }
    }
    
