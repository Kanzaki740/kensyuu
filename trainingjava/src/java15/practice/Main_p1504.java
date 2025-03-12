package java15.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main_p1504 {
	public static void main(String[] args) {
		//Date型の日時
		Date now = new Date();
		//日時情報をCalenderにセット
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		//Calenderから日の数値を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		System.out.println("現在の日時: " + sdf.format(now));
		//日に100を足した値をCalenderの日にセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		//Calenderの日時情報をDate型に変換
		Date future = c.getTime();
		//SimpleDateFormatを用いてDateインスタンスの内容を表示
		System.out.println("現在の日時: " + sdf.format(future));

	}
}