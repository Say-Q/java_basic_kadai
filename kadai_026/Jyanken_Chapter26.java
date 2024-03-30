package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//Scannerクラスのオブジェクトを作成
	Scanner scanner = new Scanner(System.in);

	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		while (true) {

			//入力内容の取得
			String input = scanner.nextLine();

			if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {

				return input;

			} else {

				System.out.println("「r,s,p」のいずれかを入力してください。");
				//無効な入力を受け取ったらループの最初に戻る
				continue;

			}

		}

	}

	public String getRandom() {

		String[] eHands = new String[3];

		eHands[0] = "g";
		eHands[1] = "s";
		eHands[2] = "p";

		int i = (int) Math.floor(Math.random() * 3);

		switch (i) {
		case 0:
			return eHands[0];

		case 1:
			return eHands[1];

		case 2:
			return eHands[2];

		default:
			return "";
		}

	}

	public void playGame() {

		Map<String, String> Hands = new HashMap<String, String>();

		Hands.put("r", "グー");
		Hands.put("s", "チョキ");
		Hands.put("p", "パー");

		String myHand = getMyChoice();
		String eHand = getRandom();
		String handMsg = "自分の手は" + Hands.get(myHand) + ",対戦相手の手は" + Hands.get(eHand);
		String winMsg = "自分の勝ちです";
		String loseMsg = "自分の負けです";

		if (myHand.equals(eHand)) {

			System.out.println(handMsg);
			System.out.println("あいこです");

		} else if (myHand.equals("r") && eHand.equals("s")) {

			System.out.println(handMsg);
			System.out.println(winMsg);

		} else if (myHand.equals("s") && eHand.equals("p")) {

			System.out.println(handMsg);
			System.out.println(winMsg);

		} else if (myHand.equals("p") && eHand.equals("r")) {

			System.out.println(handMsg);
			System.out.println(winMsg);

		} else if (myHand.equals("r") && eHand.equals("p")) {

			System.out.println(handMsg);
			System.out.println(loseMsg);

		} else if (myHand.equals("s") && eHand.equals("r")) {

			System.out.println(handMsg);
			System.out.println(loseMsg);

		} else if (myHand.equals("p") && eHand.equals("s")) {

			System.out.println(handMsg);
			System.out.println(loseMsg);

		}

		scanner.close();
	}
}
