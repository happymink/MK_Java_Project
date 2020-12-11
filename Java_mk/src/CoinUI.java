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
	int count_1000 = 0;		//지폐 3장 제한 컨트롤 변수//
	JLabel lblNewLabel;
	public CoinUI(){
	
		juice = new Juice();
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		setSize(250, 200);
		setVisible(true);
		setTitle("동전 투입기");
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
					JOptionPane.showMessageDialog(null, "최대 투입금은 5,000 원입니다.");
				}
				if (count_1000 >= 3)  //기본 5개 제외
				{
					JOptionPane.showMessageDialog(null, "지폐는 최대 투입금이 3,000 원입니다.");
				}
				if (!(juice.getMoney()+1000>5000) && !(count_1000>= 3)) {
				juice.setPlusCoin(4);
				juice.setMoney(juice.getMoney()+1000);
				count_1000 += 1;
			}}
		});


		
		
		JButton btn1 = new JButton("10");	//10원
		btn1.setBounds(120, 30, 60, 30);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CoinInput(10, 0);
			}
		});
	
		
		
		JButton btn2 = new JButton("50");	//50원
		btn2.setBounds(120, 65, 60, 30);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CoinInput(50, 1);
			}
		});
		
		

		JButton btn3 = new JButton("100");  //100원
		btn3.setBounds(120, 100, 60, 30);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CoinInput(100, 2);
			}
			
		});
	

		JButton btn4 = new JButton("500");	//500원
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
		/********** 동전 투입 함수 구현 ************/
		public void CoinInput(int won, int num) {
			
			if (juice.getMoney()+won>5000)
			{
				JOptionPane.showMessageDialog(null, "최대 투입금은 5,000 원입니다.");
			}
			if (!(juice.getMoney()+won>5000)) {
			juice.setPlusCoin(num);
			juice.setMoney(juice.getMoney()+won);
			String to = Integer.toString(juice.getMoney());
			System.out.println(to);
		
	}
	
		}	
		
	
	}
