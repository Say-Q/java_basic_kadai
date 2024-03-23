package text.section_06;

public class TypeConv_3 {
	public static void main(String[] args) {
		
		int distance = 120; //距離（m）
		int time     = 25; //所要時間（秒）
		//距離と所要時間から速度（m/秒）を計算
		float speed = (float)distance / (float)time;
		System.out.println("速度：" + speed + "m/秒");
	}
}
