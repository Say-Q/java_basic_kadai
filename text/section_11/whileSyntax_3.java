package text.section_11;

public class whileSyntax_3 {
	public static void main(String[] args) {
		
		int dice = 1; //サイコロの目
		int sum = 0; //合計
		
		//出た目の合計が10に達するまでサイコロを振り続ける
		while( sum < 10 ) {
			
			//サイコロを振る（1～6の目をランダムで生成）
			dice = (int)( Math.ceil( Math.random() * 6 ) );
			System.out.println("サイコロの目は" + dice);
			
			//出た目が4の場合は加算せず次のループへ進む
			if( dice == 4 ) {
				System.out.println("4は加算しません");
				continue;
			}
			
			//出た目を変数sumに加算
			sum += dice;
			System.out.println(dice + "を加算：現在の合計は" + sum);
		}
		
		System.out.println("最終合計は" + sum);
	}
}
