package 教科書; /**p91 List4-3 */

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        int no = rand.nextInt(100);

        System.out.println("数当てゲームの開始");
        System.out.println("0～100の数を当ててください");

        int x;
        do{
            System.out.print("いくつかな：");
            x = stdIn.nextInt();

            if ( x > no)
                System.out.println("もっと小さな数字だよ");
            else if (x < no)
                System.out.println("もっと大きな数字だよ");
        } while (x != no);

        System.out.println("正解です");
    }
}
