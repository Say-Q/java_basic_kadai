package text.section_24;

import java.util.Scanner;

public class Exception_Test4 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");

		String input = null;

		//Scannerクラスのオブジェクトを生成する
		try (Scanner scanner = new Scanner(System.in)) {
			//入力した内容を取得する
			input = scanner.next();
		};

		//入力した内容を出力する
		System.out.println("入力した内容は" + input);
	}
}
