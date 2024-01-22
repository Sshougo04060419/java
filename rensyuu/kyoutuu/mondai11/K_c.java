package mondai11;

class Operation {
    // インスタンス変数 x と y
    int x = 100;
    int y = 200;

    // 合計値を求めるメソッド
    void goukeiti() {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        System.out.println(x + " から " + y + " までの合計値は " + sum + " です。");
    }
}

public class K_c {
    public static void main(String[] args) {
        // 演算実行クラスのインスタンスを作成
        Operation operation = new Operation();

        // 合計値を求める
        operation.goukeiti();

        // 結果を表示
    }
}






