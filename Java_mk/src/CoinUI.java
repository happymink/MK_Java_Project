import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CoinUI extends JFrame {
	Container container = getContentPane();
	Panel pal =new Panel();
	Juice juice = new Juice();
	//Object[][] a = {{5,5,5,5,5}};
	//Object columnNames[] = {"��","�Ϲ� Ŀ��","�̿� ����","��� Ŀ��","ź�� ����"};
	int count_1000 = 0;
	JLabel lblNewLabel;
	//static int [] coin_wallet = {0,0,0,0,0};  //���� ����   10 , 50 , 100 , 500 , 1000 ����
	public CoinUI(){
	
		juice = new Juice();
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		setSize(250, 200);
		setVisible(true);
		setTitle("���� ���Ա�");
		getContentPane().setLayout(null);

		setVisible(true);
		JLabel lb = new JLabel();
		lb.setLayout(null);
		
		
		
		JButton btn = new JButton("1000");
		btn.setBounds(20, 30, 80, 40);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((juice.getMoney()+1000)>5000)
				{
					JOptionPane.showMessageDialog(null, "�ִ� ���Ա��� 5,000 ���Դϴ�.");
				}
				if (count_1000 >= 3)  //�⺻ 5�� ����
				{
					JOptionPane.showMessageDialog(null, "����� �ִ� ���Ա��� 3,000 ���Դϴ�.");
				}
				if (!(juice.getMoney()+1000>5000) && !(count_1000>= 3)) {
				juice.setPlusCoin(4);
				juice.setMoney(juice.getMoney()+1000);
				count_1000 += 1;
				String to = Integer.toString(juice.getMoney());
				System.out.println(to);
				System.out.println(juice.getCoinWallet(4)+ "= ����");
			}}
		});


		
		
		JButton btn1 = new JButton("10");
		btn1.setBounds(120, 30, 60, 30);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CoinInput(10, 0);
			}
		});
	
		
		
		JButton btn2 = new JButton("50");
		btn2.setBounds(120, 65, 60, 30);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CoinInput(50, 1);
			}
		});
		
		

		JButton btn3 = new JButton("100");
		btn3.setBounds(120, 100, 60, 30);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CoinInput(100, 2);
			}
			
		});
	

		JButton btn4 = new JButton("500");
		btn4.setBounds(20, 85, 80, 40);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CoinInput(500, 3);
				
			}
		});

		add(lb);
		add(btn);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}
														// ���� �Լ�
		public void CoinInput(int won, int num) {
			
			if (juice.getMoney()+won>5000)
			{
				JOptionPane.showMessageDialog(null, "�ִ� ���Ա��� 5,000 ���Դϴ�.");
			}
			if (!(juice.getMoney()+won>5000)) {
			juice.setPlusCoin(num);
			juice.setMoney(juice.getMoney()+won);
			String to = Integer.toString(juice.getMoney());
			System.out.println(to);
		
	}
	
		}	
		
	
	}
