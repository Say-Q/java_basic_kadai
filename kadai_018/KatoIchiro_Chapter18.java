package kadai_018;

//子クラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	public void setGivenName() {

		this.givenName = "一郎";

	}

	@Override
	void eachIntroduce() {

		System.out.println("好きな食べ物はリンゴです");

	}

}
