package java15.practice;

public class Main_p1501 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 101; i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");
	}
}