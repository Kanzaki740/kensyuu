package java15.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main_p1505 {
	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

		LocalDate now = LocalDate.now();
		System.out.println(now.format(fmt));

		LocalDate future = now.plusDays(100);
		System.out.println(future.format(fmt));
	}
}
