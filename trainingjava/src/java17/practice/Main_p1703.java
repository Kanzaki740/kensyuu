package java17.practice;

public class Main_p1703 {
	public static void main(String[] args) {
		try {
		int i = Integer.parseInt("三");
		}catch(NumberFormatException e) {
			System.out.println("例外:NumberFormatException");
		}
	}
}