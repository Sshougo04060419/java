package コレクション;

public class H_n {
    
}





//

import java.util.HashMap;
import java.util.Map;

class Sample8_14 {
    public static void main(String[] args){
        /* # 作成した連想配列の値を表示 */
        
        /* # 連想配列を作成 */
        Map<String, String> vegetable_dict = new HashMap<String, String>() {
            {
                put("野菜　　" , "季節");
                put("キャベツ" , "春");
                put("スイカ　" , "夏");
                put("ナス　　" , "秋");
                put("ハクサイ" , "冬");
            }
        };

        /* # 連想配列の全要素を表示 */
        for (Map.Entry<String, String> entry : vegetable_dict.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

//
