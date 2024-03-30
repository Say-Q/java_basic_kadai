package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test8 {

	public static void main(String[] args) {
		//指定する日付を取得する
		LocalDate date1 = LocalDate.of(1999, 1, 2);

		//指定する日付を出力する
		System.out.println(date1);
		//指定する日付に1年減算して出力する
		System.out.println("1年前は" + date1.minusYears(1));
		//指定する日付に1月減算して出力する
		System.out.println("1月前は" + date1.minusMonths(1));
		//指定する日付に5日減算して出力する
		System.out.println("5日前は" + date1.minusDays(5));

	}

}
