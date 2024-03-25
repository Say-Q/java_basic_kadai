package text.section_19;

public class String_Test4 {

	public static void main(String[] args) {
		String moji1 = "あいうえおかきくけこ";
		
		//開始位置のみ指定する
		System.out.println(moji1.substring(3));
		//開始位置と終了位置を指定する
		System.out.println(moji1.substring(3,5));
	}
}
