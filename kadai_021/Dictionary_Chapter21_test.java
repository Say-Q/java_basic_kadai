package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21_test {

	public void searchDic(String[] word) {

		HashMap<String, String> fruitAry = new HashMap<String, String>();

		//辞書に英単語と意味を追加する
		fruitAry.put("apple", "りんご");
		fruitAry.put("peach", "桃");
		fruitAry.put("banana", "バナナ");
		fruitAry.put("lemon", "レモン");
		fruitAry.put("pear", "梨");
		fruitAry.put("kiwi", "キウィ");
		fruitAry.put("strawberry", "いちご");
		fruitAry.put("grape", "ぶどう");
		fruitAry.put("muscat", "マスカット");
		fruitAry.put("cherry", "さくらんぼ");

		//辞書で調べた結果を格納する
		String mean = "";

		//辞書で調べる
		for (int i = 0; i < word.length; i++) {

			mean = fruitAry.get(word[i]);

			if (mean == null) {

				System.out.println(word[i] + "は辞書に存在しません");

			} else {

				System.out.println(word[i] + "の意味は" + mean);
			}

		}
	}
}