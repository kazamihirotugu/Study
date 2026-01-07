package study;

public class Task2_20 {

    public static void main(String[] args) {

    	//④子クラスを元にしたインスタンスを作成して下さい。(インスタンス名：child)
        Child child = new Child();

      //⑤インスタンスchildでcallNameメソッドを呼び出して下さい。
        child.callName();

      //⑥インスタンスchildでupdateメソッドを呼び出して下さい。
        child.update();

      //⑦オーバーロードされたargumentメソッドを呼び出し解答画像になるように出力して下さい。
        child.argument();        // 引数0つ
        child.argument(1);       // 引数が1つ
        child.argument(1, 1);    // 引数が2つ（1 + 1）
    }
}
