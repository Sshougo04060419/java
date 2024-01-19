import java.util.Scanner;

class Circle {
    // 定数として円周率を定義
    private static final double PI = 3.1415;
    
    // インスタンス変数として半径を保持
    private double radius;

    // コンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }

    // 円周の長さを求めるメソッド
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // 円の面積を求めるメソッド
    public double calculateArea() {
        return PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 半径の入力を受け取る
        System.out.print("半径を整数値で入力：");
        double radius = scanner.nextDouble();

        // Circle クラスのインスタンスを生成
        Circle circle = new Circle(radius);

        // 円周の長さを計算し表示
        double circumference = circle.calculateCircumference();
        System.out.printf("円周の長さは %.3f です。\n", circumference);

        // 円の面積を計算し表示
        double area = circle.calculateArea();
        System.out.printf("円の面積は %.3f です。\n", area);

        scanner.close();
    }
}

