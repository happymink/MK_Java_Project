import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;


public class takeback_CoinUI extends JFrame {
	Container container = getContentPane();
	Panel pal =new Panel();
	Juice juice = new Juice();
	JLabel lblNewLabel;
	
	int [] coin_wallet = {10,50,100,500,1000};  //���� ����   10 , 50 , 100 , 500 , 1000 ����
	
	
	public void backCoin(int num) {
		if (juice.getCoinWallet(num) <= 5 || juice.getProfit_money() < coin_wallet[num]) {
			JOptionPane.showMessageDialog(null, "ȸ���� ������ �����ϴ�.");
			}
		else {
			int count = juice.getCoinWallet(num) -5;				//count�� 5���� ����� ȸ�� ������ ������ ����
			SpinnerModel model = new SpinnerNumberModel(0, // �ʱⰪ
					                0,        // �ּҰ�
					              count,      // �ִ밪
					                1);       // ������
			JSpinner spinner = new JSpinner(model);
			JPanel panel = new JPanel();
			JLabel label = new JLabel("<"+coin_wallet[num]+"����> ȸ�� ������ �����ϼ��� :::   ȸ�� ���� �ݾ�: "+juice.getProfit_money() );
			panel.add(label);
			panel.add(spinner);
			String[] options = new String[]{"Ȯ��", "���"};
			int option = JOptionPane.showOptionDialog(null, panel, "���� ȸ��",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) {
				System.out.println("��� �� ������ �Ӵ� :"+juice.getProfit_money());
				Object value = 	spinner.getValue();										//JSpinner �� TextField ����  Object ��ü�� ���� �ϰ� integer �� ������ ��ȯ�Ͽ� ���� 
				int number = Integer.parseInt(value.toString());	
				if(juice.getProfit_money() - coin_wallet[num]*number < 0) {				//���ͱ��� ��û�� �ݾ׺��� ������ ���� �߻�
					JOptionPane.showMessageDialog(null, "<��ȯ ����> �ܰ� �����մϴ�");
				}
				else {
				juice.setCoinWallet(num,juice.getCoinWallet(num)-number);
				juice.setProfit_money(juice.getProfit_money()-(coin_wallet[num]*number));
				System.out.println("��� �� ������ �Ӵ� :"+juice.getProfit_money());
				JOptionPane.showMessageDialog(null, "<��ȯ ����>");
				}}// pressing OK button
		}
	}
		
	
	public takeback_CoinUI(){
	
		juice = new Juice();
		JPanel panel = new JPanel();
		
		getContentPane().add(panel);
		panel.setLayout(null);
		setSize(250, 200);
		setVisible(true);
		setTitle("���� ȸ����");
		getContentPane().setLayout(null);
	
		setVisible(true);
		JLabel lb = new JLabel();
		lb.setText("ȸ�� ���� �ݾ� :"+juice.getProfit_money());
		lb.setLayout(null);
		

		

		JButton btn = new JButton("1000");
		btn.setBounds(20, 30, 80, 40);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			backCoin(4);
			
			}
		});

		JButton btn1 = new JButton("10");
		btn1.setBounds(120, 30, 60, 30);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				backCoin(0);
			}
		});
			
		JButton btn2 = new JButton("50");
		btn2.setBounds(120, 65, 60, 30);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				backCoin(1);
			}
		});
		

		JButton btn3 = new JButton("100");
		btn3.setBounds(120, 100, 60, 30);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				backCoin(2);
			
			}
			
		});
	

		JButton btn4 = new JButton("500");
		btn4.setBounds(20, 85, 80, 40);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				backCoin(3);
				
			}
		});

	 
		add(lb);
		add(btn);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}
												
	
		
	
	}
