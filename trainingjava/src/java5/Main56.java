package java5;

public class Main56{
	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add();
	}
	public static void add() {
		int ans = x + y;
		System.out.println(x + "x" + y + "=" + ans);
	}
}
//addメソッド内で定義していないx,yを使用しているためエラー