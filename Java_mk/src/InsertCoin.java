import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InsertCoin extends JDialog {
	Juice juice = null;
	First f = null;
	public InsertCoin(Window parent, JLabel label) {
		super(parent, "Insert Coin", ModalityType.APPLICATION_MODAL);
		juice = new Juice();
		f = new First();
		int [] coin_wallet = {0,0,0,0,0};  //���� ����   10 , 50 , 100 , 500 , 1000 ����
		setSize(400,260);
		setLayout(null);
		JLabel lb = new JLabel("ȭ�� �����ϼ���");
		lb.setFont(new Font("����", Font.PLAIN, 12));
		lb.setBounds(140,0,100,50);
		
		JButton btn = new JButton("1000");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (coin_wallet[4] >= 3)
				{
					JOptionPane.showMessageDialog(null, "����� �ִ� ���Ա��� 3,000 ���Դϴ�.");}
				else {
				coin_wallet[4] += 1; 
				juice.setMoney(juice.getMoney()+1000);
				String to = Integer.toString(f.money);
				label.setText(to);
			}}
		});
		btn.setBounds(50, 130, 80, 40);
	
		
	
		
			

		add(lb);
		add(btn);
	}


}
