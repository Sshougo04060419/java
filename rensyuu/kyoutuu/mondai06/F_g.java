package 共通問題集.for;

class F_a{
    public static void main(String[] args) {
        // 1から9の段に対して九九の式を表示
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " の段");

            // 1から9までの数との掛け算を表示
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "×" + j + "=" + (i * j));
            }

            // 段と段の間に空行を挿入
            System.out.println();
        }
    }
}

