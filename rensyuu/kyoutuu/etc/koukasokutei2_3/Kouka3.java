package etc.koukasokutei2_3;

public class Kouka3 {
    public static void main(String[] args) {
      // 底辺10.5高さ5.0のtriangleインスタンスを生成
      AbsShape triangle = new Triangle(10.5, 5.0);
      // 半径8.4のCircleインスタンスを生成
      AbsShape circle = new Circle(8.4);
      // triangleインスタンスのdisplayDataメソッドを呼び出す
      triangle.displayData();
      // circleインスタンスのdisplayDataメソッドを呼び出す
      circle.displayData();
    }
  }
  
