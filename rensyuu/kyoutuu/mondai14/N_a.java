package mondai14;

import java.util.Scanner;//入力する問題の定型文

public class N_a {
    public static void main(String[] args) {
        //Scannerクラスのインスタンスを生成
        //引数で標準入力System.inを指定する
        Scanner scanner = new Scanner(System.in);

        //・表示する　・文字列の表示を促す
        System.out.print("文字列を入力: ");
        //入力された内容をインスタンスから取得
        String nyuuryoku = scanner.nextLine();

        //入力された内容を画面に表示
        System.out.println(nyuuryoku);
    }
}

