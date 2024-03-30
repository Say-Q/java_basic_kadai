package text.section_23;

import java.util.Scanner;

public class Scanner_Teset4 {

	public static void main(String[] args) {
		System.out.println("小数点を含んだ数値を入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		//入力した内容を取得する
		double input = scanner.nextDouble();

		//入力した内容を出力する
		System.out.println("入力した小数点を含んだ数値は" + input);

		//Scannerクラスのオブジェクトをクローズする
		scanner.close();
	}
}
