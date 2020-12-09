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
	
	int [] coin_wallet = {10,50,100,500,1000};  //코인 지갑   10 , 50 , 100 , 500 , 1000 순서
	
	
	public void backCoin(int num) {
		if (juice.getCoinWallet(num) <= 5 || juice.getProfit_money() < coin_wallet[num]) {
			JOptionPane.showMessageDialog(null, "회수할 동전이 없습니다.");
			}
		else {
			int count = juice.getCoinWallet(num) -5;				//count는 5개를 남기고 회수 가능한 동전의 개수
			SpinnerModel model = new SpinnerNumberModel(0, // 초기값
					                0,        // 최소값
					              count,      // 최대값
					                1);       // 증가값
			JSpinner spinner = new JSpinner(model);
			JPanel panel = new JPanel();
			JLabel label = new JLabel("<"+coin_wallet[num]+"원권> 회수 개수를 선택하세요 :::   회수 가능 금액: "+juice.getProfit_money() );
			panel.add(label);
			panel.add(spinner);
			String[] options = new String[]{"확인", "취소"};
			int option = JOptionPane.showOptionDialog(null, panel, "동전 회수",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) {
				System.out.println("계산 전 프로핏 머니 :"+juice.getProfit_money());
				Object value = 	spinner.getValue();										//JSpinner 의 TextField 값을  Object 객체로 저장 하고 integer 형 변수로 변환하여 저장 
				int number = Integer.parseInt(value.toString());	
				if(juice.getProfit_money() - coin_wallet[num]*number < 0) {				//이익금이 요청한 금액보다 적으면 오류 발생
					JOptionPane.showMessageDialog(null, "<반환 실패> 잔고가 부족합니다");
				}
				else {
				juice.setCoinWallet(num,juice.getCoinWallet(num)-number);
				juice.setProfit_money(juice.getProfit_money()-(coin_wallet[num]*number));
				System.out.println("계산 후 프로핏 머니 :"+juice.getProfit_money());
				JOptionPane.showMessageDialog(null, "<반환 성공>");
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
		setTitle("동전 회수기");
		getContentPane().setLayout(null);
	
		setVisible(true);
		JLabel lb = new JLabel();
		lb.setText("회수 가능 금액 :"+juice.getProfit_money());
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
