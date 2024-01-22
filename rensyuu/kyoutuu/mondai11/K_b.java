package mondai11;

class K_b {
    // クラス変数 x と y
    static int x; // クラス変数 x
    static int y; // クラス変数 y

    // 合計値を求めるメソッド
    static int calculateSum() {//static:クラスメゾットであることを示す　int:整数値で返すことを示す
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i; // x から y までの合計値を計算
        }
        System.out.println(K_b.x + " から " + K_b.y + " までの合計値は " + result + " です。");
    }
}

class MainApp {
    public static void main(String[] args) {
        // クラス K_b のクラス変数 x と y に値を代入
        K_b.x = 100;
        K_b.y = 200;

        // クラス K_b のメソッド calculateSum() を呼び出して合計値を求める
        int result = K_b.calculateSum();

        // 結果を表示
        
    }
}



