package text.section_14;

public class MethodPlus_2 {

	public static void main(String[] args) {
		
		final int postage1 = 500; //送料1
		final int postage2 = 800; //送料2
		
		//1,000円に送料1を加算して表示
		addPostage( 1000, postage1 );
		
		//1,000円に送料2を加算して表示
		addPostage( 1000, postage2 );

	}
	
	//送料を追加した料金を表示するメソッド
	public static void addPostage( final int price, final int postage ) {
		int total = price + postage; //価格に送料を加算
		System.out.println("送料込みの料金は" + total + "円");
	}

}
