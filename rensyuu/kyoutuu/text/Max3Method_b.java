package 教科書; /**p198 List7-3 */

import java.util.Scanner;

class Max3Method_b {
    static String max(int a, int b, int c) { /**対応する型にする　String型＝"〇〇"　*/
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return "max";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();
        System.out.print("整数c:"); int c = stdIn.nextInt();

        System.out.println("最大値は" + max(a, b, c) + "です");
    }
}