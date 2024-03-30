package text.section_22;

import java.time.LocalDateTime;

public class DateTime2_Test4 {

	public static void main(String[] args) {
		//LocalDateTime型に指定する
		LocalDateTime dateTime = LocalDateTime.parse ("1999-01-10T02:30:40");

		//LocalDateTime型に指定された変数の値を出力する
		System.out.println(dateTime);
	}
}
