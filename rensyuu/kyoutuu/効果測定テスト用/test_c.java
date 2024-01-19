package 効果測定テスト用;

public class test_c {
    public static void main(String[] args) {
      // 整数型変数のnum1を宣言し、10を代入する
        int num1 = 10;
      // 整数型変数のnum2を宣言し、3を代入する
        int num2 = 3;
      // 計算結果を格納する浮動小数点型変数num3とnum4,num5を宣言する
        double num3,num4,num5;
      // num1をnum2で割り、計算結果をnum3に代入する。ただし、小数点以下についても計算させる。
        num3 = (double)num1 / (double)num2;
      // num4に円周率のリテラル(小数点第4位まで)を代入する
        num4 = 3.1415
      // num5に、num3をnum4で割った数を代入する
        num5 = num3 / num4;
      // 表示用の整数型変数ansを宣言し、num5に小数点第1位で四捨五入した値を代入する
        int ans = (int)Math.round(num5);
      // ansの内容を表示する
        System.out.println("(10/3)/3.1415の計算の結果は・・・"+ans);
    }
}
