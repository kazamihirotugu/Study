package study;

/**
* 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
*
* 問①〜問③まであります。
* 全て回答し、課題にある画像と同じ表示になるようにしてください。
*
*/

// ① FruitsConstants.javaをインポート
import constants.FruitsConstants;
// ② Fruits.javaをインポート
import fruits.Fruits;

public class Task2_19 {
    public static void main(String[] args) {

        /* ③ Fruits.javaのprintFruitsメソッドを呼び出す
         * FruitsConstantsに指定されている定数を引数に設定
         */
    	Fruits.printFruits(
    	        FruitsConstants.FRUITS_LEMON_04,
    	        FruitsConstants.FRUITS_COUNT_20
        );
    }
}
