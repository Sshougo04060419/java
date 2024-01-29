package mondai15;

import java.util.InputMismatchException;
import java.util.Scanner;

class O_b {
    public static void main(String[] args) {
        Scanner nyuuryoku = new Scanner(System.in);

        System.out.print("整数を入力=");

        try {int x = nyuuryoku.nextInt();
            if (x % 2 == 0)
            System.out.println(x+"は偶数");
            else 
            System.out.println(x+"は奇数");
        }   catch(InputMismatchException e ) {
            System.out.print("整数値と認識できません！！");
        }
        }
    }

