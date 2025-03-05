package java5;

public class Main59{
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
		int error = ans + 1; //returnの後の処理は実行されず、コンパイルエラー
	}
	public static void main(String[] args) {
		System.out.println(add(add(10, 20), add(30, 40)));
	}
}