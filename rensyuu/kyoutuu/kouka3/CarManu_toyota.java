package kouka3;

// 車メーカーのクラス
// class CarManu_toyota {
//     // Toyotaの説明文を取得するメソッド
//     public static String getToyotaDescription() {
//         return "\r\n世界のトップブランドであるトヨタは、時代に合わせた技術と堅実な作りで定評のあるメーカーです。\r\n"+"走行距離が多くても故障しにくいことから中古車としても高値が付きやすいのも人気のひとつです。\r\n" +"近年ではハイブリッド技術の先頭を走っており、多様な車種を展開しているので、はじめて車を購入する方も自身のニーズに適した車に出会いやすいかもしれません。\r\n"+"\r\n-----トヨタの代表的な車-----\r\n"+"・プリウス・ヤリス・アクア・カローラ・アルファード、ヴェルファイア・ランドクルーザー・ハリアー・ライズ・ルーミーなどがあります\r\n";
//     }
//     public static String getDescription() {
//         return getToyotaDescription();
//     }
// }
    // 他の車メーカーの説明文を追加



    // トヨタのメーカークラス
    class CarManuToyota extends CarManufacturer {
        @Override
        public String getDescription() {
            return "\r\n世界のトップブランドであるトヨタは、時代に合わせた技術と堅実な作りで定評のあるメーカーです\r\n" +"走行距離が多くても故障しにくいことから中古車としても高値が付きやすいのも人気のひとつです。\r\n" + "近年ではハイブリッド技術の先頭を走っており、多様な車種を展開しているので、はじめて車を購入する方も自身のニーズに適した車に出会いやすいかもしれません。\r\n" + "\r\n-----トヨタの代表的な車-----\r\n" + "・プリウス・ヤリス・アクア・カローラ・アルファード、ヴェルファイア・ランドクルーザー・ハリアー・ライズ・ルーミーなどがあります\r\n" ;
        }
    }