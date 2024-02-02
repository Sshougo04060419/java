package mondai14;
import java.util.Scanner;

public class N_c {
    public static void main(String[] args) {
        Scanner nyuuryoku = new Scanner(System.in);
        //Scannerクラスのインスタンス'nyuuryoku'を作成

        System.out.print("文字列を入力：");

        String inputString = nyuuryoku.nextLine();
        //ユーザーが入力した文字列を inputString という変数に格納

        StringBuilder stringBuilder = new StringBuilder(inputString);

        if (stringBuilder.length() > 10) {
            stringBuilder.setLength(10);
        }

        // 切り詰めた結果を出力
        System.out.println("結果文字列: " + stringBuilder.toString());

    }
}
