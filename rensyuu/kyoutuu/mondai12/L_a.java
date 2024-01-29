package mondai12;

import java.util.Scanner;

/**
 * 電卓クラス
 * 
 */
class calculator {

    /**
     * 足し算した結果を返却
     * 
     * @param x
     * @param y
     * @return xとyの加算値
     */
    int x;
    int y;
    calculator(int x, int y){
        this.x = x;
        this.y = y;
    } 
    void calcusum(int x,int y){
        int tasizan = x+y;
        System.out.println("Sum "+x+" and "+y+" = "+tasizan);
    }
	


    /**
     * 平均値を算出して返却
     * 
     * @param x
     * @param y
     * @return xとyの平均値
     */
	void calcave(int x, int y){
        int heikinti = (x+y)/2;
        System.out.println(" Average "+x+" and "+y+" = "+heikinti);
    }


}

/**
 * 拡張電卓クラス
 * 
 */
//サブクラス
class MoreCale extends calculator  {
    /**
     * 累乗を算出して返却
     * 
     * @param x
     * @param y
     * @return xとyの累乗
     */
    MoreCale(int x, int y){ super(x,y); }
    void calcPow(int x, int y){
        double ruijou = Math.pow(x,y);
        System.out.println(" Power "+x+" of "+y+" = "+ruijou);
    }
}


/**
 * メイン処理クラス
 */
public class L_a { 
    public static void main(String[] args) {
        Scanner nyuuryoku = new Scanner(System.in);

        // メインクラスの生成とメイン処理実行
		System.out.print("整数を入力してください：");
        int a = nyuuryoku.nextInt();
        System.out.print("整数を入力してください：");
        int b = nyuuryoku.nextInt();
        // 拡張電卓インスタンス生成
		MoreCale xxx = new MoreCale(a, b);


    	// 合計値
		xxx.calcusum(a, b);

		// 平均値
		xxx.calcave(a, b);

    	// 累乗
		xxx.calcPow(a, b);
    }
}

