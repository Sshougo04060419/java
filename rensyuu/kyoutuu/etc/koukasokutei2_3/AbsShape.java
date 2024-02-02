package etc.koukasokutei2_3;

__(1)__ class AbsShape {
    // フィールド定義
    // 図形の種類
    private int shapeType;
    private String[] shapeTypeStr = {"三角形","四角形","円"};

    // この図形の種類の文字列を返却するメソッド
    String getShapeTypeStr(){
        return shapeTypeStr[shapeType];
    };
    void setShapeType(int num){
        shapeType = num;
        }
      // shapeTypeのゲッター
        int getShapeType(){
        return shapeType;
        };
    
      // 抽象メソッド定義
      // 面積を計算して返却する抽象メソッド
        __(1)__ double calcArea();
      // 図形のデータを表示する抽象メソッド
        __(1)__ void displayData();
    }
    

