package 効果測定テスト用;
// Scannerクラスのインポート
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);
    // ユーザーが入力した文字列を格納する変数を宣言する。
    String str = "";
    //コマンドプロンプト上に"コマンドを入力してください。："と表示する
    System.out.print("コマンドを入力してください。：");
    //ユーザーにコマンド入力をしてもらう
    str = stdIn.nextLine();
    //ユーザーが入力したコマンドによって、表示する文字列を変える
    switch (str){
        case "up":
          //コマンドプロンプトにupが入力された時の文字列を表示する
            System.out.println("ジャンプしました！");
            break;
        case "down":
          //コマンドプロンプトにdownが入力された時の文字列を表示する
            System.out.println("しゃがんでいます！");
            break;
        case "right":
          //コマンドプロンプトにrightが入力された時の文字列を表示する
            System.out.println("右へ移動しました");
            break;
        case "left":
          //コマンドプロンプトにleftが入力された時の文字列を表示する
            System.out.println("左へ移動しました");
            break;
        case "A":
          //コマンドプロンプトにAが入力された時の文字列を表示する
            System.out.println("ファイアーボール！");
            break;
            default:
                //存在しないコマンドが打ち込まれた場合には、無効なコマンドであることをメッセージで表示する
                System.out.println("無効なコマンドが打ち込まれました。\n もう一度実行してください。");
            }
            }
        }
        


