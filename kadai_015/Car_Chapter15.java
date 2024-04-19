package kadai_015;

public class Car_Chapter15 {

	// フィールドを定義（内部データ）
	private int  gear = 1; // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
	
	//コンストラクタ
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear;
	}
	
	// ギアの値により速度を変えるメソッド
	int afterGear;
	public void gearChange( final int afterGear ) {
		// switch文により、ギアに応じた速度を定義する
		switch(afterGear) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10; 
		}
		
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
			
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
	
}
