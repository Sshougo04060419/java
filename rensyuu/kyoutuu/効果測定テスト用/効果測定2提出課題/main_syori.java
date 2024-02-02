package 効果測定テスト用.効果測定2提出課題;

import java.util.Scanner;

public class main_syori{
    public static void main(String[] args) {
        // ユーザーにメーカー名の入力を促す
        Scanner scanner = new Scanner(System.in);
        System.out.print("メーカー名を入力してください: ");
        String userInput = scanner.nextLine();

        // 入力されたメーカー名に応じて説明文を表示
        switch (userInput) {
            case "Toyota":
            case "toyota":
            case "TOYOTA":
                System.out.println(CarManufacturer.getToyotaDescription());
                break;
            case "Honda":
                System.out.println(CarManufacturer.getHondaDescription());
                break;
            case "Sony":
                System.out.println(ElectronicsManufacturer.getSonyDescription());
                break;
            case "Samsung":
                System.out.println(ElectronicsManufacturer.getSamsungDescription());
                break;
            default:
                System.out.println("対応するメーカーがありません。");
        }

        // スキャナーを閉じる
        scanner.close();
    }
}
