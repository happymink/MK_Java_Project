package class6;

interface Wearble{

	void putOn(); //�Ա�
	void putOff(); //����
}

//�������̽� ����
class AppleWearble implements Wearble{
	@Override
	public void putOn() {
		System.out.println("�Ա�");
	}
	@Override
	public void putOff() {
		System.out.println("����");
	}

}



class Headphone implements Wearble {		//����� Ŭ����
	public void setVolume() {
		System.out.println("���� ����");
	}

	@Override
	public void putOn() {
		System.out.println("�Ա�");
		
	}

	@Override
	public void putOff() {
		System.out.println("����");
		
	}
	
}

class WearableComputer implements Wearble{		//����� ��ǻ�� Ŭ����	
	public void reset() {
		System.out.println("����");
	}

	@Override
	public void putOn() {
		System.out.println("�Ա�");
		
	}

	@Override
	public void putOff() {
		System.out.println("����");
		
	}
}
public class InterfaceEx {
	public static void main(String [] args) {
		AppleWearble Wearble = new AppleWearble();

	Wearble.putOff();
	Wearble.putOn();

	
	
	}
	}

	


