package java17;

import java.io.FileWriter;

public class Main17_7 {
	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw  = new FileWriter("data.txt");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			fw.close();
		}
	}
}