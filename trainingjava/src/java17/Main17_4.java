package java17;

import java.io.FileWriter;

public class Main17_4 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("エラーです");
		}
		fw.close();
	}
}