package java3回目提出課題;

import java.util.Scanner;

public class Main_processing{
    public static void main(String[] args) {
        // ユーザーにメーカー名の入力を促す
        Scanner scanner = new Scanner(System.in);

        try {
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
            case "mazda":
            case "MAZDA":
                System.out.println(CarManu_mazda.getmazdaDescription());
                break;
            
            case "Suzuki":
            case "suzuki":
            case "SUZUKI":
            System.out.println(CarManu_suzuki.getsuzukiDescription());
                break;

            case "Daihatsu":
            case "daihatsu":
            case "DAAIHATSU":
            System.out.println(CarManu_daihatsu.getdaihatsuDescription());
                break;

            case "Mitsubishi":
            case "mitsubishi":
            case "MITSUBISHI":
            case "Mitubishi":
            case "mitubishi":
            case "MITUBISHI":
            case "Mitsubisi":
            case "mitsubisi":
            case "MITSUBISI":
            System.out.println(CarManu_mitsubishi.getmitsubishiDescription());
                break;

            case "Subaru":
            case "subaru":
            case "SUBARU":
                System.out.println(CarManu_subaru.getsubaruDescription());
                break;

            case "Lexas":
            case "lexas":
            case "LEXAS":
                System.out.println(CarManu_lexas.getlexasDescription());
                break;

            case "Mitsuoka":
            case "mitsuoka":
            case "MITSUOKA":
            case "Mituoka":
            case "mituoka":
            case "MITUOKA":
                System.out.println(CarManu_mitsuoka.getmitsuokaDescription());
            break;

            case "Isuzu":
            case "isuzu":
            case "ISUZU":
                System.out.println(CarManu_isuzu.getisuzuDescription());
            break;




            default:
            throw new IllegalArgumentException("対応するメーカーがないか、正しく入力されていません。");
    }
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

