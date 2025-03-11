package java15;

public class Main15_10 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//ここで何らかの時間がかかる処理
		for (int i = 0; i < 100; i++) {
			System.out.print('X');
		}
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");
	}
}