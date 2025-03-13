package java17.practice;

public class Main_p1702 {
	public static void main(String[] args) {
		try {
			String s = null;

			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("NullPointException例外をcatchしました");
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();
			System.out.println("ーースタックトレース（ここまで）ーー");
		}
	}
}