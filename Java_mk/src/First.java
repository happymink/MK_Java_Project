import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;


	/* 이미지 패널 클래스 생성*/
class ImagePanel extends JPanel{
	private Image img;
	
	
	public ImagePanel (Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
		
		}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}


public class First extends JFrame {
	Juice juice = null;
	CoinUI coin = null;
	public int money = 0;
	boolean can_buy = false;
	String menu="";
	String[] options ; //패스워드 필드 
	char[] password ; //패스워드 필드
	String basic_pw = "";
	JLabel viewProductLabel;
	JLabel lblNewLabel;
	private JFrame frame;
	
	/*		각 재고당  최대 3개 한정생성		*/
	Queue1 stock0 = new Queue1(3);
	Queue1 stock1 = new Queue1(3);
	Queue1 stock2 = new Queue1(3);
	Queue1 stock3 = new Queue1(3);
	Queue1 stock4 = new Queue1(3);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public First() {
		initialize();
	}

	
	private void initialize() {
		juice = new Juice();
		frame = new JFrame();
		frame.setSize(477, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("민균 자판기"); //타이틀 이름 설정
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		/*              상품 이미지 패널                     */
		
		ImagePanel testpanel = new ImagePanel (new ImageIcon("C:\\Users\\민균\\git\\MK_Java_Project\\Java_mk/image/back4.jpg").getImage());
		ImagePanel water = new ImagePanel (new ImageIcon("image/water.png").getImage());
		ImagePanel coffe = new ImagePanel (new ImageIcon("image/cof.jpg").getImage());
		ImagePanel pocari = new ImagePanel (new ImageIcon("image/pocari.png").getImage());
		ImagePanel coffe1 = new ImagePanel (new ImageIcon("image/cof1.png").getImage());
		ImagePanel coke = new ImagePanel (new ImageIcon("image/coke.png").getImage());

	
		frame.getContentPane().add(testpanel);
		frame.getContentPane().add(coffe1);
		frame.getContentPane().add(coffe);
		frame.getContentPane().add(water);
		frame.getContentPane().add(pocari);
		frame.getContentPane().add(coke);
		water.setBounds(25, 35, 60, 60);
		coffe.setBounds(90, 35, 60, 60);
		pocari.setBounds(155, 35, 60, 60);
		coffe1.setBounds(220, 35, 60, 60);
		coke.setBounds(25, 130, 60, 60);
		frame.getContentPane().add(testpanel);
		viewProductLabel = new JLabel();
		viewProductLabel.setFont(new Font("굴림", Font.BOLD, 10));
		viewProductLabel.setHorizontalAlignment(SwingConstants.CENTER);
		viewProductLabel.setBounds(12, 251, 133, 125);
		viewProductLabel.setText(menu);
		lblNewLabel = new JLabel();
		lblNewLabel.setText("0");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(198, 330, 66, 30);
		testpanel.add(lblNewLabel);
		testpanel.add(viewProductLabel);
		
		

		
		
		/*		재고 1~5까지 5개로 채우기 					*/
		stock0.fillQueue(3);
		stock1.fillQueue(3);
		stock2.fillQueue(3);
		stock3.fillQueue(3);
		stock4.fillQueue(3);
		/*ㅡㅡㅡㅡ              ㅡㅡㅡㅡㅡㅡㅡ                         ㅡㅡㅡㅡㅡ*/
		
		JButton button = new JButton("\u25CF"); //생수
		
		button.addActionListener(new ActionListener() {
		
	
			public void actionPerformed(ActionEvent e) {
				if(stock0.isEmpty())
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(0)+"재고가 부족합니다");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(0),juice.getproductprice(0),0);
				}
			
		});
		button.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button.setBounds(27, 108, 55, 21);
		testpanel.add(button);
		
		JButton button_1 = new JButton("\u25CF"); //일반 커피
		button_1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			

				if(stock1.isEmpty())
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(1)+"재고가 부족합니다");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(1),juice.getproductprice(1),1);
				}
				
		});
		button_1.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_1.setBounds(94, 108, 55, 21);
		testpanel.add(button_1);
		
		JButton button_2 = new JButton("\u25CF"); //이온음료
		button_2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				if(stock2.isEmpty())
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(2)+"재고가 부족합니다");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(2),juice.getproductprice(2),2);
				}
				
		});
		button_2.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_2.setBounds(159, 108, 55, 21);
		testpanel.add(button_2);
		
		JButton button_3 = new JButton("\u25CF"); //고급 커피
		button_3.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				if(stock3.isEmpty())
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(3)+"재고가 부족합니다");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(3),juice.getproductprice(3),3);
				
				}
		});
		button_3.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_3.setBounds(222, 108, 55, 21);
		testpanel.add(button_3);
		
		JButton button_4 = new JButton("\u25CF"); //탄산음료
		button_4.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				if(stock4.isEmpty())
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(4)+"재고가 부족합니다");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(4),juice.getproductprice(4),4);
				}
				
		});
		button_4.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_4.setBounds(27, 206, 55, 21);
		testpanel.add(button_4);
		
		
		// 동전 투입
		JButton btnNewButton = new JButton("COIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CoinUI();
				if (money >= 5000) {
					System.out.println("5000 초과");
					JOptionPane.showMessageDialog(null, "기본 알림창입니다.");}
				
				
//				juice.setMoney(500);
//				System.out.println(juice.getMoney());
//				String to = Integer.toString(juice.getMoney());
//				lblNewLabel.setText(to);
			
			}});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 9));
		btnNewButton.setBounds(157, 283, 57, 30);
		testpanel.add(btnNewButton);
		
	
		
		JButton btnNewButton_2 = new JButton("");		//구매 버튼
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				payment_product();
			}
		});
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(248, 265, 34, 30);
		testpanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");		//잔돈 반환
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return_money();
			}
		});
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setBounds(222, 263, 24, 21);
		testpanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");  //현재 돈 새로고침
		btnNewButton_4.setBounds(152, 326, 34, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String to = Integer.toString(juice.getMoney());
				System.out.println(juice.getMoney());
				lblNewLabel.setText(to);
			
			}});
		testpanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("관리자 비밀번호 변경"); //비밀번호 변겅
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				check_password();
			}
		});
		btnNewButton_5.setBounds(320, 83, 114, 45);
		testpanel.add(btnNewButton_5);
		
		
		JButton btnNewButton_1 = new JButton("관리자 모드");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Join_admin();
			
			}});
		btnNewButton_1.setBounds(320, 51, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
		


		public void showlabel(String name, int price, int index){//판매 데이터 입력
			
			String canbuy="";
			juice.setName(name);
			juice.setPrice(price);
			juice.setindex(index);
			
		
			System.out.println(menu);
		
		
			
			if (juice.getMoney() >= juice.getPrice()) {
				System.out.println(juice.getMoney() >= juice.getPrice());
				canbuy = "구매가 가능한 상품입니다.";
			}
			else {
				canbuy = "잔액이 부족합니다.";
				}
			
			menu = "<html><body>상품명: "+juice.getName()+"<br>가격 : "+juice.getPrice()+"<br>" +canbuy+ "</body></html>";
			viewProductLabel.setText(menu);

//			if(juice.getName() != null && juice.getPrice() != 0 ) {
//			
//				// 기능 구현
//			}
			
			
			
			
			
			
		}//showlabel
		public void Join_admin() {			//관리자 모드 접속 함수
			JPanel panel = new JPanel();
			JLabel label = new JLabel("비밀번호를 입력하세요:");
			JPasswordField pass = new JPasswordField(10);
			panel.add(label);
			panel.add(pass);
			String[] options = new String[]{"확인", "취소"};
			int option = JOptionPane.showOptionDialog(null, panel, "관리자 모드 접속",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) // pressing OK button
			{
			    char[] password = pass.getPassword();
			    String pasww = new String(password);
			    if(juice.getpassword().equals(pasww))
			    {
			    	 System.out.println(new String(password)==juice.getpassword());
			    	JOptionPane.showMessageDialog(null, "로그인 성공!");
			    	new InventoryUI();
			    }
			    else {
			    System.out.println("Your password is: " + new String(password));
			    JOptionPane.showMessageDialog(null, "로그인 실패!");
			    }
			    }
		}
		
		public void return_money() {
			int [] coin = {10,50,100,500,1000};	//잔돈 반환 함수
			int total= juice.getMoney();
			String text = "";
			
			if (juice.getMoney() == 0) {
				JOptionPane.showMessageDialog(null, "반환할 돈이 없습니다");
				viewProductLabel.setText(" ");
				juice.setName(null);
				juice.setPrice(0);
			}
			
			else {
			for (int i=4; i>-1; i--) {
				int count = 0;
				
				while(total / coin[i] >0) {
					count++;
					total -= coin[i];
					juice.setMinusCoin(i, count);
				}
				
				juice.setMoney(total);
				text = text + coin[i] + "원권 :" + count +" 개. ";		//잔돈이 어떤 화폐로 반환됬는지 text저장
				
				}
			JOptionPane.showMessageDialog(null, "잔돈이 반환되었습니다");
			JOptionPane.showMessageDialog(null,text);
			
			}
			lblNewLabel.setText("0");
			viewProductLabel.setText(" ");
			juice.setName(null);
			juice.setPrice(0);
		}
		
		public void payment_product() { //결제 함수
			int index = juice.getindex();
			System.out.println("현재 인덱스:"+index);
			if (juice.getName()==null) {
				JOptionPane.showMessageDialog(null, "상품을 선택하세요");
			}
				else if (juice.getMoney() < juice.getPrice() || (juice.getMoney() < 0)) {
				JOptionPane.showMessageDialog(null, "결제 실패");
			}
			else {
			int ans = JOptionPane.showConfirmDialog(this, "<"+juice.getName()+"> 주문하시겠습니까?\n"+"결제 가능 금액:    "+juice.getMoney()+"       물품 가격:  "+juice.getPrice(),
													"결제 확인 창", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
		
			if (ans == 0) {
				
				//재고 -1
				//판매 수량 +1
				try 
				{
					Minus_Stock();
					
					juice.setStock(index,juice.getStock(index)-1);
					System.out.println("getstock index -1");
					System.out.println(juice.getStock(0)-1);
					juice.setMoney(juice.getMoney()-juice.getPrice());
					juice.setProfit_money(juice.getPrice());
					JOptionPane.showMessageDialog(null, "결제 성공!");
					System.out.println("이익금"+juice.getProfit_money());
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, juice.getName()+" 재고가 없습니다.");
					
				}
				
				
			}
			
			
			}
			viewProductLabel.setText("");
			String to = Integer.toString(juice.getMoney());
			System.out.println(juice.getMoney());
			lblNewLabel.setText(to);
			juice.setName(null);
			juice.setPrice(0);
		}
		
		public void change_password() {
			
			JPanel panel = new JPanel();
			JLabel label = new JLabel("새로운 비밀번호를 입력하세요:");
			JPasswordField pass = new JPasswordField(10);
			panel.add(label);
			panel.add(pass);
			String[] options = new String[]{"변경", "취소"};
			int option = JOptionPane.showOptionDialog(null, panel, "비밀번호 변경",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) // pressing OK button
			{
			    char[] password = pass.getPassword();
			    String pasww = new String(password);   
			    String pwPattern ="^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,12}$";	//영문,숫자,특수문자		    		
			    Matcher matcher = Pattern.compile(pwPattern).matcher(pasww);
			    System.out.println(pasww);
	
			    if(matcher.find()){
			        juice.setpassword(pasww);
			        JOptionPane.showMessageDialog(null, "비밀번호가 변경되었습니다!");
			    }
			    else {
			    	JOptionPane.showMessageDialog(null, "8~12자 이내, 숫자 및 특수문자를 하나 이상 포함하세요!");
			    }
			    }
			   
			}
		
		public void check_password() {
			JPanel panel = new JPanel();
			JLabel label = new JLabel("현재 비밀번호를 입력하세요:");
			JPasswordField pass = new JPasswordField(10);
			panel.add(label);
			panel.add(pass);
			String[] options = new String[]{"확인", "취소"};
			int option = JOptionPane.showOptionDialog(null, panel, "비밀번호 체크",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) // pressing OK button
			{
			    char[] password = pass.getPassword();
			    String pasww = new String(password);
			    if(juice.getpassword().equals(pasww))
			    {
			    	 System.out.println(new String(password)==juice.getpassword());
			    	JOptionPane.showMessageDialog(null, "비밀번호 일치!");
			    	change_password();
			    }
			    else {
			    System.out.println("Your password is: " + new String(password));
			    JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다!");
			    }
			    }
		}
		
		public void Minus_Stock() {
			
			System.out.println("현재"+juice.getproductname(juice.getindex())+juice.getStock(juice.getindex())+"의 재고 :");
			System.out.println("현재 겟 인덱스:"+juice.getindex()+"현재 겟 네임 : "+juice.getName()+ "0번째 겟 프러덕트네임:"+ juice.getproductname(0));
			
			if (juice.getName()==juice.getproductname(0)) {
				stock0.deQueue();
				juice.setStock(juice.getindex(),juice.getStock(0)-1);
				 JOptionPane.showMessageDialog(null, juice.getproductname(0)+"재고 가감");
		
			}
			else if(juice.getName()==juice.getproductname(1)){
				stock1.deQueue();
				juice.setStock(juice.getindex(),juice.getStock(1)-1);
				 JOptionPane.showMessageDialog(null, "재고 가감");
			}
			else if(juice.getName()==juice.getproductname(2)) {
				stock2.deQueue();
				juice.setStock(juice.getindex(),juice.getStock(2)-1);
				 JOptionPane.showMessageDialog(null, "재고 가감");
			}
			else if(juice.getName()==juice.getproductname(3)) {
				stock3.deQueue();
				juice.setStock(juice.getindex(),juice.getStock(3)-1);
				 JOptionPane.showMessageDialog(null, "재고 가감");
			}
			else if(juice.getName()==juice.getproductname(4)) {
				stock4.deQueue();
				juice.setStock(juice.getindex(),juice.getStock(4)-1);
				 JOptionPane.showMessageDialog(null, "재고 가감");
			}
			
				
			}
			
		
		}

		
		

		

	


