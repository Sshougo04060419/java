package etc.koukasokutei;

public class Triangle {
    private double bottom;  // 底辺
    private double height;  // 高さ

    // コンストラクタ定義
    public Triangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    // メソッド定義
    // 底辺を返すゲッター
    public double getBottom() {
        return bottom;
    }
    // 高さを返すゲッター
    public double getHeight() {
        return height;
    }
    public void setBottom(double num){
        this.bottom = num;
        }
      //高さをセットするセッター
        public void setHeight(double num){
        this.height = num;
        }
        
      // 面積を求めるメソッドの定義
      // 引数なし
        public double calcArea() {
        // 三角形の面積を返す
        return this.bottom * this.height / 2;
        }
    }
    


