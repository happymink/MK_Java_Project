package class6;

interface Wearble{

	void putOn(); //입기
	void putOff(); //벗기
}

//인터페이스 구현
class AppleWearble implements Wearble{
	@Override
	public void putOn() {
		System.out.println("입기");
	}
	@Override
	public void putOff() {
		System.out.println("벗기");
	}

}



class Headphone implements Wearble {		//헤드폰 클래스
	public void setVolume() {
		System.out.println("볼륨 설정");
	}

	@Override
	public void putOn() {
		System.out.println("입기");
		
	}

	@Override
	public void putOff() {
		System.out.println("벗기");
		
	}
	
}

class WearableComputer implements Wearble{		//웨어러블 컴퓨터 클래스	
	public void reset() {
		System.out.println("리셋");
	}

	@Override
	public void putOn() {
		System.out.println("입기");
		
	}

	@Override
	public void putOff() {
		System.out.println("벗기");
		
	}
}
public class InterfaceEx {
	public static void main(String [] args) {
		AppleWearble Wearble = new AppleWearble();

	Wearble.putOff();
	Wearble.putOn();

	
	
	}
	}

	


