package mondai14;

import java.util.Scanner;//入力する問題の定型文

public class N_b {
    public static void main(String[] args) {
        // Scannerクラスのインスタンスを生成
        Scanner scanner = new Scanner(System.in);

        //・表示する　・文字列の表示を促す
        System.out.print("文字列を入力: ");

        // 入力された文字列を取得
        String nyuuryoku = scanner.nextLine();

        // 入力された文字列を画面に表示
        System.out.println("入力された文字数は " + nyuuryoku.length() + " です");
    }
}

