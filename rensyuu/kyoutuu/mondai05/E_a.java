package mondai05;

import java.util.Scanner; //入力するプログラミングの定型文 

class E_a {
    public static void main(String[] args) {
        // Scannerを使ってユーザーに値を入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.print("A～D の値を入力してください：");
        char rank = scanner.next().charAt(0); // 1文字目を取得

        // 入力された値に対応するランクにメッセージを表示
        displayRankMessage(rank);

        // Scannerを閉じる
        scanner.close();
    }

    // ランクに対応するメッセージを表示するメソッド
    static void displayRankMessage(char rank) {
        switch (rank) {
            case 'A':
                System.out.println("ランクAは評価「優」です");
                break;
            case 'B':
                System.out.println("ランクBは評価「良」です");
                break;
            case 'C':
                System.out.println("ランクCは評価「可」です");
                break;
            case 'D':
                System.out.println("ランクDは評価「不可」です");
                break;
            
        }
    }
}





/*
import java.util.Scanner;

class Sample5_1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

            # ランクによる成績評価表示 
        System.out.print("A～Dの値を入力してください：");
        char rank = stdIn.next().charAt(0);
        
        switch (rank) {
            case 'A':
                System.out.println("ランクAは評価「優」です");
                break;
            case 'B':
                System.out.println("ランクBは評価「良」です");
                break;
            case 'C':
                System.out.println("ランクCは評価「可」です");
                break;
            case 'D':
                System.out.println("ランクDは評価「不可」です");
                break;
        }
    }
}
 */