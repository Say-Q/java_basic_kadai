package text.section_23;

import java.util.Scanner;

public class Scanner_Test6 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		//「,（カンマ）」を区切り文字として指定する
		scanner.useDelimiter(",");

		//入力した内容を取得する
		String input = scanner.next();

		//入力した内容を出力する
		System.out.println(input);

		//Scannerクラスのオブジェクトをクローズする
		scanner.close();
	}
}
