package java3回目提出課題;

import java.util.Scanner;

public class main_syori{
    public static void main(String[] args) {
        // ユーザーにメーカー名の入力を促す
        Scanner scanner = new Scanner(System.in);
        System.out.print("国産車メーカー名を英語で入力してください: ");
        String userInput = scanner.nextLine();

        // 入力されたメーカー名に応じて説明文を表示
        switch (userInput) {
            case "Toyota":
            case "toyota":
            case "TOYOTA":
                System.out.println(CarManu_toyota.getToyotaDescription());
                break;
            case "Honda":
            case "honda":
            case "HONDA":
                System.out.println(CarManu_honda.getHondaDescription());
                break;
            case "Nissan":
            case "nissan":
            case "NISSAN":
                System.out.println(CarManu_nissan.getNissanDescription());
                break;
            case "Matda":
                System.out.println(CarManu_matda.getDescription());
                break;
            default:
                System.out.println("対応するメーカーがないか、正しく入力されていません。");
        }

        // スキャナーを閉じる
        scanner.close();
    }
}
