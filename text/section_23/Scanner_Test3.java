package text.section_23;

import java.util.Scanner;

public class Scanner_Test3 {

	public static void main(String[] args) {
		System.out.println("整数を入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		//入力した内容を取得する
		int input = scanner.nextInt();

		//入力した内容を出力する
		System.out.println("入力した整数は" + input);

		//Scannerクラスのオブジェクトをクローズする
		scanner.close();

	}
}
