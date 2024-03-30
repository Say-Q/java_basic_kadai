package text.section_24;

public class Exception_Test5 {

	public static void main(String[] args) {
		//体重を表す変数
		double weight = -10.0;
		if (weight < 0) {
			throw new IllegalArgumentException("体重は入力された" + weight + "のようにマイナスの値になりません");
		}
	}
}
