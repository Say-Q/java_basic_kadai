package text.section_23;

import java.util.Scanner;

public class Scanner_Test5 {

	public static void main(String[] args) {
		System.out.println("真偽値を入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		//入力した内容を取得する
		boolean input = scanner.nextBoolean();

		//入力した内容を出力する
		System.out.println("入力した真偽値は" + input);

		//Scannerクラスのオブジェクトをクローズする
		scanner.close();

	}
}
