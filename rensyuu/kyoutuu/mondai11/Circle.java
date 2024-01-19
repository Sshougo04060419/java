package mondai11;
import java.util.Scanner;

class Circle {
    public static void main(String[] args){

    Scanner keisan1 = new Scanner(System.in); //キーボード入力を促すメッセージの表示
  //Scanner 変数名1 = new Scanner(System.in)
    System.out.println("半径を整数値で入力："); //表示する
    Circle2 keisan4 = new Circle2(keisan1.nextInt(), 3.1415);
    keisan4.keisan3();
    }
}

class Circle2{
  int nyuuryoku ;
  double pi ;
  double ensyuu ;
  double menseki ;

  Circle2(int nyuuryoku, double pi){
    this.nyuuryoku = nyuuryoku;
    this.pi = pi;
  }
  void keisan3(){
    ensyuu = (nyuuryoku+nyuuryoku)*pi;
    menseki = nyuuryoku*nyuuryoku*pi;
    System.out.println("円周の長さは"+ensyuu+"です");
    System.out.println("円の面積は"+menseki+"です");
  }
}