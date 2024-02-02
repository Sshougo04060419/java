package mondai14;
import java.util.Scanner;

class N_e {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("東京都千代田区 ");
        stringBuilder.insert(5, "神田神保町");
        String result = stringBuilder.toString();

        // 結果を出力
        System.out.println(result);
    }
}
