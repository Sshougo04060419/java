package etc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1つ目の数字の入力
            System.out.print("数字を入力してください: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            // 2つ目の数字の入力
            System.out.print("もう一つ数字を入力してください: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            // 掛け算の結果を計算
            int result = num1 * num2;

            // 結果の表示
            System.out.println(num1 + " x " + num2 + " = " + result);
        } catch (NumberFormatException e) {
            // 数字でない入力があった場合のエラーメッセージ
            System.out.println("数字を入力してください。");
        } finally {
            // 入力が途中で終了した場合のメッセージ
            System.out.println("入力が途中で終了しました");
        }
    }
}
