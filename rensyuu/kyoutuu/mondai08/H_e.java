package mondai08;

public class H_e {
    
}





//

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Sample8_5 {
    public static void main(String[] args){

        /* 要素数が5のリストを作成し、全要素の合計値と平均値を表示する */
        /* 整数値リスト */
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        
        /* 合計値を表示 */
    	for(int i = 0; i < array.size(); i++)
		{
		   sum += array.get(i);
		}
        System.out.println("合計値は" + sum + "です。");

        /* 平均値を表示 */
        System.out.println("平均値は" + (sum / array.size()) + "です。");
    }
} 
//
