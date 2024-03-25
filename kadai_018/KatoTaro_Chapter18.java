package kadai_018;

//子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	public void setGivenName() {

		this.givenName = "太郎";

	}

	@Override
	void eachIntroduce() {

		System.out.println("私はKJavaが得意です");

	}

}