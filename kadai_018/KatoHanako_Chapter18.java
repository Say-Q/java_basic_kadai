package kadai_018;

//子クラス
public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	public void setGivenName() {

		this.givenName = "花子";

	}

	@Override
	void eachIntroduce() {

		System.out.println("趣味は読書です");

	}

}
