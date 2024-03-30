package text.section_22;

import java.time.LocalTime;

public class DateTime2_Test2 {

	public static void main(String[] args) {
		//現在時刻を取得する
		LocalTime time1 = LocalTime.now();
		//上記時刻を出力する
		System.out.println(time1);

		//指定する時刻を取得する
		LocalTime time2 = LocalTime.of(5, 10, 20);
		//上記時刻を出力する
		System.out.println(time2);
	}

}
