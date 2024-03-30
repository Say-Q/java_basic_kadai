package kadai_018;

//親クラス
public abstract class Kato_Chapter18 {

	//姓、名、住所フィールド
	String familyName = "加藤";
	String givenName;
	String address = "東京都中の区○×";

	public void commonIntroduce() {

		System.out.println("名前は" + this.familyName + givenName + "です");
		System.out.println("住所は" + this.address + "です");

	}

	abstract void eachIntroduce();{

	}

	public void execIntroduce() {
		
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println();
	}
}