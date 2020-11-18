package class6;

interface Skinnable{
	
	int BLACK = 0;
	int RED = 1;
	int GREEN =2;
	int BLUE = 3;
	int YELLOW =4;
	
	void changeSkin(int skin); //스킨 변경

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

		
		System.out.println("□나의 이름은"+ name + "입니다.");
		System.out.println("주인님의 이름은" + master +"입니다.");
		System.out.print("\n");
		
	}
}


class RobotPet extends Pet{
	public RobotPet(String name, String master) {
		super(name, master);
		// TODO Auto-generated constructor stub
	}

	public void Selfintroduce() {
		System.out.println("■나는 로봇!" + "이름은" + name);
		System.out.println("주인님의 이름은" + master +"입니다.");
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
			myskin = "검정";
		if(skin == 1)
			myskin = "빨강";
		if(skin == 2)
			myskin = "초록";
		if(skin == 3)
			myskin = "파랑";
		if(skin == 4)
			myskin = "노랑";
		
	}
	public void Selfintroduce(int skin) {
		
		changeSkin(skin);
		System.out.println("★나는 로봇!" + "이름은" + name);
		System.out.println("주인님의 이름은" + master +"입니다.");
		System.out.println("스킨은" + myskin +"입니다.");
		System.out.print("\n");
	}


}
public class InterfaceClassEx {
	public static void main(String [] args) {
		Pet a = new Pet("Kurt", "아이");
		RobotPet b = new RobotPet("R2D2", "루크");
		SkinableRobotPet c = new SkinableRobotPet("OSX5", "Apple", 0);
		Pet d = new Pet("마이클", "영남");
		
		a.Selfintroduce();
		b.Selfintroduce();
		c.Selfintroduce(2);
		d.Selfintroduce();
		
		
	}
}
