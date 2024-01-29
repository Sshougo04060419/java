package mondai11;



//Student クラスは、学生情報を保持するためのクラス
class Student {
    private String name;          //学生の名前を示すインスタンス関数
    private String studentNumber; //学生の番号を示すインスタンス関数
    private int japanese;         //国語の点数を示すインスタンス関数
    private int math;             //算数の点数を示すインスタンス関数
    private int english;          //英訳の点数を示すインスタンス関数

    public Student(String name, String studentNumber, int japanese, int math, int english) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.japanese = japanese;
        this.math = math;
        this.english = english;
    }
    //国語、数学、英語の平均点を計算
    public double calculateAverage() {
        return Math.floor((japanese + math + english) / 3.0 * 100) / 100; // 平均点（小数点第3位以下切り捨て）
    }

    public int calculateTotal() {
        return japanese + math + english; // 合計点
    }

    public String getStudentInfo() {
        return studentNumber + "番 " + name + "さん 平均点 " + calculateAverage();
    }
}




public class K_g {
    public static void main(String[] args) {
        Student studentA = new Student("Aさん", "001", 89, 65, 88);
        Student studentB = new Student("Bさん", "002", 80, 95, 64);
        Student studentC = new Student("Cさん", "003", 70, 80, 98);

        // 学生情報を表示
        System.out.println(studentA.getStudentInfo());
        System.out.println(studentB.getStudentInfo());
        System.out.println(studentC.getStudentInfo());
    }
}
