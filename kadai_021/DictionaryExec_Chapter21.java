package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		Dictionary_Chapter21 sWord = new Dictionary_Chapter21();
		
		//辞書をセット
		sWord.fruitDic();
		
		//検索語を設定
		sWord.setSearchWord("apple");
		
		//辞書を検索
		sWord.SearchDic();
		

	}

}
