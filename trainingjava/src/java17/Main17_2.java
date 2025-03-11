package java17;

import java.io.FileWriter;
import java.io.IOException;

public class Main17_2 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました。");
		}
	}
}