package etc.koukasokutei2_3;

import java.lang.Math;

/**
  円クラスの定義
*/
public class Circle __(2)__ {
  // フィールド定義
  private double rad; 
  public Circle(double rad) {
    // 抽象クラスから継承されたshapeTypeに円を意味する2を代入する
    this.setShapeType(2);
    // 半径を代入
    this.rad = rad;
  }

  //ゲッターとセッターを定義
  public double getRad() {
    return rad;
  }
  public void setRad(double rad) {
    this.rad = rad;
  }

  // 抽象メソッドのオーバーライド
  // 面積を計算して返却する
  public double calcArea(){
    //円の面積の求め方は、半径×半径×円周率
    //小数点第3位を四捨五入する
    return Math.round((Math.pow(rad, 2) * Math.PI) * 100) / 100.0;
  };

  // 図形のデータを表示するメソッド
  public void displayData() {
    System.out.println("この図形は" + __(3)__ + "です。");

    System.out.println("この図形の半径は" + this.getRad() + "です。");
    System.out.println("この図形の面積は" + this.calcArea() + "です。");
  }
}



