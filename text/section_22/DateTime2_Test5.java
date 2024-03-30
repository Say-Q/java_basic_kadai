package text.section_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime2_Test5 {

	public static void main(String[] args) {
		//日時を取得する
		LocalDateTime datetime = LocalDateTime.of(1999, 1, 2, 5, 10, 20);

		//指定するフォーマットでDateTimeFromatterクラスのオブジェクトを生成する
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		//取得した日時を、生成したDateTimeFormatterクラスのオブジェクトでフォーマットする
		String afterFormat = datetime.format(formatter);

		//フォーマットした日時を出力する
		System.out.println(afterFormat);

	}
}
