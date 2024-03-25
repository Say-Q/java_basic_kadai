package text.section_16;

public class Capsule_Test3 {

	public static void main(String[] args) {
		
		//Capsule_Tanaka3クラスのオブジェクトを作る
		Capsule_Tanaka3 tanaka = new Capsule_Tanaka3();
		
		//セッターを実行する
		tanaka.setId(7);
		int id = tanaka.getId();
		System.out.println("idは" + id);

	}

}
