package mondai15;
import java.util.InputMismatchException;
import java.util.Scanner;

class O_a {
    public static void main(String[] args) {
        Scanner nyuuryoku = new Scanner(System.in);

        System.out.print("整数1=");int x = nyuuryoku.nextInt();
        System.out.print("整数2=");int y = nyuuryoku.nextInt();

            try {
                System.out.println(x+"/"+y+"="+x/y);
            }   catch (ArithmeticException e) {
                System.out.println("0による割り算です!!" );
            }   finally {
                System.out.print("処理終了");
                
            }
        }
    }
