import java.util.ArrayList;

import javax.swing.JFrame;

public class MachineActlmpl extends JFrame implements MachineAct  {
	ArrayList<MachineVO> list = new ArrayList<>();
	
	private int remain_money = 0;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
	}
	
	
	
	@Override
	public void insert_Coin() {
		
	}
}
