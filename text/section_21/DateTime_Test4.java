package text.section_21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_Test4 {

	public static void main(String[] args) {
		//現在日時を取得する
		Date date = new Date();

		//SimpleDateFormatクラスのコンストラクタの引数に、特定のフォーマットを渡して実行する。
		//その結果、SimpleDateFormatクラスのオブジェクトを生成する。
		SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");

		//取得した日時を、生成したSimpleDateFormatクラスのオブジェクトでフォーマットする。
		System.out.println(format.format(date));
	}
}
