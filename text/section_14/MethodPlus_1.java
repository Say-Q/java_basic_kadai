package text.section_14;

public class MethodPlus_1 {

	public static void main(String[] args) {
		
		//1,000円を送料込みの料金にして表示
		addPostage(1000);
		
		//1,200円を送料込みの料金にして表示
		addPostage(1200);

	}
	
	//送料を追加した料金を表示するメソッド
	public static void addPostage( final int price ) {
		int total = price + 500; //価格に送料を加算
		System.out.println("送料込みの料金は" + total + "円");
		
	}

}
