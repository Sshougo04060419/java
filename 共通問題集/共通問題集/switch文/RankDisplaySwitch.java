package switch文;

import java.util.Scanner; //入力するプログラミングの定型文 

class RankDisplaySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scannerクラスの引数は入力ストリームを指定します。このSystem.inは、入力標準を意味する。
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

