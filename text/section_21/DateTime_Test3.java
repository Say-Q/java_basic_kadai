package text.section_21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_Test3 {

	public static void main(String[] args) {
		//現在日時を取得する
		Date date = new Date();

		//SimpleDateFormatクラスのコンストラクタを引数無しで実行する。
		//その結果、SimpleDateFormatクラスのオブジェクトを生成する。
		SimpleDateFormat format = new SimpleDateFormat();

		//取得した日時を、生成したSimpleDateFormatクラスのオブジェクトでフォーマットする。
		System.out.println(format.format(date));
	}
}
