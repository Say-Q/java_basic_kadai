package text.section_13;

public class Method_1 {

	public static void main(String[] args) {
		
		int greeting = 123;
		
		//greetingメソッドの呼び出し（１回目）
		greeting();
		
		//greeting変数の値を表示
		System.out.println(greeting);
		
		//greetingメソッドの呼び出し（２回目）
		greeting();

	}
	
	//朝のあいさつメッセージを表示するメソッド
	public static void greeting() {
		System.out.println("おはようございます！");
		System.out.println("昨日はよく眠れましたか？");
		System.out.println("今日も一日頑張りましょう！");
		
	}

}
