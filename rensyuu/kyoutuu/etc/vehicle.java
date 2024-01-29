package etc;




/*

class クラス名{
    クラスの定義
}

*/

class vehicle {

//  ----------------------[プロパティ]--------------------
//  1,プロパティから書く
    String Name;        //名前
    int    engine_size; //排気量
//-------------------------------------------------------



public void setName(String name) {
        Name = name;
    }

    public void setEngine_size(int engine_size) {
        this.engine_size = engine_size;
    }

//-----------------------[メゾット]------------------------
public void getOn() {
    System.out.println("誰かが乗りました");
}

public void move() {
    System.out.println("動き始めました");
}
}
//---------------------------------------------------------

/*  順番　　　　　　 例
 *  クラス名        人　　　　　
 *  プロパティ      名前、性格
 *  メゾット        手を振る、歩く
 */





//-------------------[メゾット]-----------------------------
/*[コンストラクト構文]※
 */
