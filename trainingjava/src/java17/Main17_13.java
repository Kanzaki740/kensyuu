package java17;

public class Main17_13 {
	public static void main(String[] args) {
		try {
			//試験的に例外を発生させる
			throw new UnsupportedMusicFileException17_12("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}