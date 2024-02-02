package etc;

public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilderのインスタンスを作成
        StringBuilder stringBuilder = new StringBuilder();

        // 文字列の追加
        stringBuilder.append("Hello");

        // 文字列の挿入
        stringBuilder.insert(5, " World");

        // 文字列の削除
        stringBuilder.delete(5, 11);

        // 最終的な結果を取得
        String result = stringBuilder.toString();

        // 結果を出力
        System.out.println(result);  // 出力: Hello
    }
}


