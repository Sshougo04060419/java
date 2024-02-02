package mondai14;
import java.util.Scanner;

class N_d {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //System.out.println("文字列を2つ入力してください。");
        System.out.print("1 つ目文字列を入力："); int a = stdIn.nextInt();
        System.out.print("2 つ目文字列を入力："); int b = stdIn.nextInt();
        if (a == b)
            System.out.println("同じ文字列です。");
        else
            System.out.println("違う文字列です。");
    }
}
//p54 list3-3
