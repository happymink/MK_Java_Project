package class6;

interface Skinnable{
	
	int BLACK = 0;
	int RED = 1;
	int GREEN =2;
	int BLUE = 3;
	int YELLOW =4;
	
	void changeSkin(int skin); //��Ų ����

}

class Pet {
	
	String name;
	String master;
	
	public Pet(String name, String master)
	{
		this.name = name;
		this.master = master;
	}
	
	
	public void Selfintroduce() {

		
		System.out.println("�೪�� �̸���"+ name + "�Դϴ�.");
		System.out.println("���δ��� �̸���" + master +"�Դϴ�.");
		System.out.print("\n");
		
	}
}


class RobotPet extends Pet{
	public RobotPet(String name, String master) {
		super(name, master);
		// TODO Auto-generated constructor stub
	}

	public void Selfintroduce() {
		System.out.println("�ᳪ�� �κ�!" + "�̸���" + name);
		System.out.println("���δ��� �̸���" + master +"�Դϴ�.");
		System.out.print("\n");
	}
	
}

class SkinableRobotPet extends RobotPet implements Skinnable{
	

	
	public String myskin;
	
	public SkinableRobotPet(String name, String master, int skin) {
		super(name, master);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void changeSkin(int skin) {
	
		if(skin == 0)
			myskin = "����";
		if(skin == 1)
			myskin = "����";
		if(skin == 2)
			myskin = "�ʷ�";
		if(skin == 3)
			myskin = "�Ķ�";
		if(skin == 4)
			myskin = "���";
		
	}
	public void Selfintroduce(int skin) {
		
		changeSkin(skin);
		System.out.println("�ڳ��� �κ�!" + "�̸���" + name);
		System.out.println("���δ��� �̸���" + master +"�Դϴ�.");
		System.out.println("��Ų��" + myskin +"�Դϴ�.");
		System.out.print("\n");
	}


}
public class InterfaceClassEx {
	public static void main(String [] args) {
		Pet a = new Pet("Kurt", "����");
		RobotPet b = new RobotPet("R2D2", "��ũ");
		SkinableRobotPet c = new SkinableRobotPet("OSX5", "Apple", 0);
		Pet d = new Pet("����Ŭ", "����");
		
		a.Selfintroduce();
		b.Selfintroduce();
		c.Selfintroduce(2);
		d.Selfintroduce();
		
		
	}
}
