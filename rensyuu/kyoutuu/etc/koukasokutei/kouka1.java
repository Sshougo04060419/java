package etc.koukasokutei;

public class kouka1 {
    public static void main(String[] args) { 
        // コンストラクタによりインスタンスを生成 
        // 底辺を12.3、高さを45.5とする 
        double bottom = 12.3; 
        double height = 45.5; 
        Triangle triangle = new Triangle(bottom,height);;
    
        // ゲッターを使用して底辺を表示 
        System.out.println("底辺 = " + triangle.getBottom()); 
        System.out.println("高さ = " + triangle.getHeight()); 

        // 面積を求めるメソッドを使用して面積を表示 
        System.out.println("面積 = " + triangle.calcArea()); 
    
        // セッターを使用して底辺を23.4、高さを56.7とする 
        triangle.setBottom(23.4);
        triangle.setHeight(56.7);
    
        // 底辺、高さを変更した後の三角形の面積を表示 
        System.out.println("変更後の面積 = " +triangle.calcArea()); 
        }
    } 
    

