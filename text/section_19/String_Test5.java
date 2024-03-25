package text.section_19;

public class String_Test5 {

	public static void main(String[] args) {
		String moji1 = "あいう";
		String moji2 = "あ　い　う　え　お";
		
		//"あいう"を"かきく"に置換する
		System.out.println(moji1.replace("あいう","かきく"));
		//全角余白を空白無しに置換する
		System.out.println(moji2.replace("　", ""));
	}
}
