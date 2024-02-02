package mondai14;

public class N_f {
    public static void main(String[] args) {
        // StringBuilderのインスタンスを作成
        StringBuilder stringBuilder = new StringBuilder();
//追加
        stringBuilder.append("東京都神田神保町");
//削除
        stringBuilder.delete(3, 9);
//挿入
        stringBuilder.insert(3, " 千代田区");
//挿入
        //stringBuilder.insert(8, "神田神保町");

        String result = stringBuilder.toString();

        // 結果を出力
        System.out.println(result);  // 出力: Hello



}
}
