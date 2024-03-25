package text.section_19;

public class String_Test8 {

	public static void main(String[] args) {
		String moji1 = "   あい うえお ";
		String moji2 = "\n\tかき\tくけこ\n";
		
		//文字列の先頭と末尾の空白を削除して出力
		System.out.println(moji1.trim());
		//文字列の先頭と末尾の水平タブと改行を削除して出力
		System.out.println(moji2.trim());
		
	}
}
