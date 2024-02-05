package Java_3rd_Submission_Assignment;
// import java.util.Scanner;


// // メインの処理を行うクラス
// public class Main_processing{
//     public static void main(String[] args) {
//         // ユーザーにメーカー名の入力を促す
//         Scanner scanner = new Scanner(System.in);

//         try {
//             System.out.print("国産車メーカー名を英語で入力してください: ");
//             String userInput = scanner.nextLine();

//         // 入力されたメーカー名に応じて説明文を表示
//         switch (userInput) {
//             // Toyotaに関する説明文を表示
//             case "Toyota":
//             case "toyota":
//             case "TOYOTA":
//             System.out.println(CarManu_toyota.getToyotaDescription());
//                 break;

//             // Hondaに関する説明文を表示
//             case "Honda":
//             case "honda":
//             case "HONDA":
//                 System.out.println(CarManu_honda.getHondaDescription());
//                 break;
            
//                 // Nissannに関する説明文を表示
//             case "Nissan":
//             case "nissan":
//             case "NISSAN":
//                 System.out.println(CarManu_nissan.getNissanDescription());
//                 break;

//             // Mazdaに関する説明文を表示
//             case "Matda":
//             case "mazda":
//             case "MAZDA":
//                 System.out.println(CarManu_mazda.getmazdaDescription());
//                 break;
            
//             // Suzukiに関する説明文を表示
//             case "Suzuki":
//             case "suzuki":
//             case "SUZUKI":
//             System.out.println(CarManu_suzuki.getsuzukiDescription());
//                 break;

//             // Daihatsuに関する説明文を表示
//             case "Daihatsu":
//             case "daihatsu":
//             case "DAAIHATSU":
//             System.out.println(CarManu_daihatsu.getdaihatsuDescription());
//                 break;

//             // Mitsubishiに関する説明文を表示
//             case "Mitsubishi":
//             case "mitsubishi":
//             case "MITSUBISHI":
//             case "Mitubishi":
//             case "mitubishi":
//             case "MITUBISHI":
//             case "Mitsubisi":
//             case "mitsubisi":
//             case "MITSUBISI":
//             System.out.println(CarManu_mitsubishi.getmitsubishiDescription());
//                 break;

//             // Subaruに関する説明文を表示
//             case "Subaru":
//             case "subaru":
//             case "SUBARU":
//                 System.out.println(CarManu_subaru.getsubaruDescription());
//                 break;

//             // Lexasに関する説明文を表示
//             case "Lexas":
//             case "lexas":
//             case "LEXAS":
//                 System.out.println(CarManu_lexas.getlexasDescription());
//                 break;

//             // Mitsuokaに関する説明文を表示
//             case "Mitsuoka":
//             case "mitsuoka":
//             case "MITSUOKA":
//             case "Mituoka":
//             case "mituoka":
//             case "MITUOKA":
//                 System.out.println(CarManu_mitsuoka.getmitsuokaDescription());
//             break;

//             // Isuzuに関する説明文を表示
//             case "Isuzu":
//             case "isuzu":
//             case "ISUZU":
//                 System.out.println(CarManu_isuzu.getisuzuDescription());
//             break;



//             default:
//             throw new IllegalArgumentException("対応するメーカーがないか、正しく入力されていません。");
//     }
//         } catch (Exception e) {
//             System.out.println("エラー: " + e.getMessage());
//         } finally {
//             scanner.close();
//         }
//     }
// }


import java.util.Scanner;

class MainProcessing {
    public static void main(String[] args) {
        // ユーザーにメーカー名の入力を促す
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("国産車メーカー名を英語で入力してください: ");
            String userInput = scanner.nextLine().toLowerCase();

            // 入力されたメーカー名に応じて説明文を表示
            String description = getDescription(userInput);
            System.out.println(description);

        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String getDescription(String userInput) {
        switch (userInput) {
            case "toyota":
                return new CarManuToyota().getDescription();
            case "honda":
                return new CarManuHonda().getDescription();
            case "nissan":
                return new CarManuNissan().getDescription();
            case "mazda":
                return new CarManuMazda().getDescription();
            case "suzuki":
                return CarManuSuzuki.getDescription();
            case "daihatsu":
                return CarManuDaihatsu.getDescription();
            case "mitsubishi":
                return CarManuMitsubishi.getDescription();
            case "subaru":
                return CarManuSubaru.getDescription();
            case "lexus":
                return CarManuLexuas.getDescription();
            case "mitsuoka":
                return CarManuMitsuoka.getDescription();
            case "isuzu":
                return CarManuIsuzu.getDescription();
            default:
                throw new IllegalArgumentException("対応するメーカーがないか、正しく入力されていません。");
        }
    }
}


