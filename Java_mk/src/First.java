import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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


	/* �̹��� �г� Ŭ���� ����*/
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


public class First {
	Juice juice = null;
	CoinUI coin = null;
	InventoryUI inventory =null;

	public int money = 0;
	boolean can_buy = false;
	String menu="";
	String[] options ; //�н����� �ʵ� 
	char[] password ; //�н����� �ʵ�
	String basic_pw = "";
	JLabel viewProductLabel;
	JLabel lblNewLabel;
		private JFrame frame;
	Queue1 q = null;
	/*		�� ����  �ִ� 3�� ��������		*/
	


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
		inventory = new InventoryUI();
		frame.setSize(477, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("�α� ���Ǳ�"); //Ÿ��Ʋ �̸� ����
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		inventory.setVisible(false);
		
		/*              ��ǰ �̹��� �г�                     */
		
		ImagePanel testpanel = new ImagePanel (new ImageIcon("C:\\Users\\�α�\\git\\MK_Java_Project\\Java_mk/image/back4.jpg").getImage());
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
		viewProductLabel.setFont(new Font("����", Font.BOLD, 10));
		viewProductLabel.setHorizontalAlignment(SwingConstants.CENTER);
		viewProductLabel.setBounds(12, 251, 133, 125);
		viewProductLabel.setText(menu);
		lblNewLabel = new JLabel();
		lblNewLabel.setText("0");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(198, 330, 66, 30);
		testpanel.add(lblNewLabel);
		testpanel.add(viewProductLabel);
		
		

 
		
		/*		��� 1~3���� ���� �� 3���� ä��� 					*/
		
		
		juice.CreatList();
		
		/*�ѤѤѤ�              �ѤѤѤѤѤѤ�                         �ѤѤѤѤ�*/
		
		JButton button = new JButton("\u25CF"); //1�� ��ǰ(0) >>����
		
		button.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent e) {
				if(juice.getStock(0)==0)
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(0)+"��� �����մϴ�");
					viewProductLabel.setText("");
					
				}
				else
					showlabel(juice.getproductname(0),juice.getproductprice(0),0);
				}
			
		});
		button.setFont(new Font("210 �縻���� R", Font.PLAIN, 10));
		button.setBounds(27, 108, 55, 21);
		testpanel.add(button);
		
		JButton button_1 = new JButton("\u25CF"); //2�� ��ǰ(1) >>�Ϲ� Ŀ��
		button_1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			

				if(juice.getStock(1)==0)
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(1)+"��� �����մϴ�");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(1),juice.getproductprice(1),1);
				}
				
		});
		button_1.setFont(new Font("210 �縻���� R", Font.PLAIN, 10));
		button_1.setBounds(94, 108, 55, 21);
		testpanel.add(button_1);
		
		JButton button_2 = new JButton("\u25CF"); //3�� ��ǰ(2) >> �̿�����
		button_2.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				if(juice.getStock(2)==0)
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(2)+"��� �����մϴ�");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(2),juice.getproductprice(2),2);
				}
				
		});
		button_2.setFont(new Font("210 �縻���� R", Font.PLAIN, 10));
		button_2.setBounds(159, 108, 55, 21);
		testpanel.add(button_2);
		
		JButton button_3 = new JButton("\u25CF"); //4�� ��ǰ(3) >> ��� Ŀ��
		button_3.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				if(juice.getStock(3)==0)
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(3)+"��� �����մϴ�");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(3),juice.getproductprice(3),3);
				
				}
		});
		button_3.setFont(new Font("210 �縻���� R", Font.PLAIN, 10));
		button_3.setBounds(222, 108, 55, 21);
		testpanel.add(button_3);
		
		JButton button_4 = new JButton("\u25CF"); //5�� ��ǰ(4) >> ź������
		button_4.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
			
				if(juice.getStock(4)==0)
				{
					JOptionPane.showMessageDialog(null, juice.getproductname(4)+"��� �����մϴ�");
					viewProductLabel.setText("");
				}
				else
					showlabel(juice.getproductname(4),juice.getproductprice(4),4);
				}
				
		});
		button_4.setFont(new Font("210 �縻���� R", Font.PLAIN, 10));
		button_4.setBounds(27, 206, 55, 21);
		testpanel.add(button_4);
		

		// ���� ����
		JButton btnNewButton = new JButton("COIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CoinUI();
				if (money >= 5000) {
					System.out.println("5000 �ʰ�");
					JOptionPane.showMessageDialog(null, "�⺻ �˸�â�Դϴ�.");}
			
			}});
		btnNewButton.setFont(new Font("����", Font.BOLD, 9));
		btnNewButton.setBounds(157, 283, 57, 30);
		testpanel.add(btnNewButton);
		
	
		
		JButton btnNewButton_2 = new JButton("");		//���� ��ư
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				payment_product();
			}
		});
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(248, 265, 34, 30);
		testpanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");		//�ܵ� ��ȯ
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return_money();
			}
		});
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setBounds(222, 263, 24, 21);
		testpanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");  //���� �� ���ΰ�ħ
		btnNewButton_4.setBounds(152, 326, 34, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String to = Integer.toString(juice.getMoney());
				System.out.println(juice.getMoney());
				lblNewLabel.setText(to);
			
			}});
		testpanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("������ ��й�ȣ ����"); //��й�ȣ ����
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				check_password();
			}
		});
		btnNewButton_5.setBounds(320, 83, 114, 45);
		testpanel.add(btnNewButton_5);
		
		
		JButton btnNewButton_1 = new JButton("������ ���");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Join_admin();
			
			}});
		btnNewButton_1.setBounds(320, 51, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
		

			/*	Ŭ�� �� ��ǰ�� �������� �Լ� 	*/
		public void showlabel(String name, int price, int index){//�Ǹ� ������ �Է�
			juice.setindex(index);
			if (juice.getStock(index)==0) {
				JOptionPane.showMessageDialog(null, "���� �Ұ�! <��� ����>.");
			}
			
			String canbuy="";
			juice.setName(name);
			juice.setPrice(price);
			juice.setindex(index);
		
			if (juice.getMoney() >= juice.getPrice()) {
				canbuy = "���Ű� ������ ��ǰ�Դϴ�.";
			}
			else {
				canbuy = "�ܾ��� �����մϴ�.";
				}
			
			menu = "<html><body>��ǰ��: "+juice.getName()+"<br>���� : "+juice.getPrice()+"<br>" +canbuy+ "</body></html>";
			viewProductLabel.setText(menu);

		}
		
		
		/* ������ ��� ���� �Լ�	*/
		public void Join_admin() {		
			JPanel panel = new JPanel();
			JLabel label = new JLabel("��й�ȣ�� �Է��ϼ���:");
			JPasswordField pass = new JPasswordField(10);
			panel.add(label);
			panel.add(pass);
			String[] options = new String[]{"Ȯ��", "���"};
			int option = JOptionPane.showOptionDialog(null, panel, "������ ��� ����",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) // pressing OK button
			{
			    char[] password = pass.getPassword();
			    String pasww = new String(password);
			    if(juice.getpassword().equals(pasww))
			    {
			    	 System.out.println(new String(password)==juice.getpassword());
			    	JOptionPane.showMessageDialog(null, "�α��� ����!");
			    	new InventoryUI();
			    }
			    else {
			    System.out.println("Your password is: " + new String(password));
			    JOptionPane.showMessageDialog(null, "�α��� ����!");
			    }
			    }
		}
		
		
			/*		�ܵ� ��ȯ �Լ�		*/
		public void return_money() {
			int [] coin = {10,50,100,500,1000};	
			int total= juice.getMoney();
			String text = "";
			
			if (juice.getMoney() == 0) {
				JOptionPane.showMessageDialog(null, "��ȯ�� ���� �����ϴ�");
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
					juice.setMinusCoin(i);
				}
				
				juice.setMoney(total);
				text = text + coin[i] + "���� :" + count +" ��. ";		//�ܵ��� � ȭ��� ��ȯ����� text����
				
				}
			JOptionPane.showMessageDialog(null, "�ܵ��� ��ȯ�Ǿ����ϴ�");
			JOptionPane.showMessageDialog(null,text);
			
			}
			lblNewLabel.setText("0");
			viewProductLabel.setText(" ");
			juice.setName(null);
			juice.setPrice(0);
		}
		
		public void payment_product() { //���� �Լ�
		
			if (juice.getName()==null) {
				JOptionPane.showMessageDialog(null, "��ǰ�� �����ϼ���");
			}
				else if (juice.getMoney() < juice.getPrice() || (juice.getMoney() <= 0)) { 	//�ܾ��� ��ǰ ���ݺ��� �۰ų� 0���� �۰ų� ������� 
				JOptionPane.showMessageDialog(null, "���� ����");				
			}
			else {
			int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getName()+"> �ֹ��Ͻðڽ��ϱ�?\n"+"���� ���� �ݾ�:    "+juice.getMoney()+"       ��ǰ ����:  "+juice.getPrice(),
													"���� Ȯ�� â", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
		
			if (ans == 0) {
				
				
				//�Ǹ� ���� +1
				try 
				{
					if (juice.getName()==juice.getproductname(0) && !(juice.getStock(0)==0)) {
						juice.Stock0.deleteNode();
						juice.setMiounsStock(0);
					}
					else if(juice.getName()==juice.getproductname(1)&& !(juice.getStock(1)==0)){
						juice.Stock1.deleteNode();
						juice.setMiounsStock(1);
					}
					else if(juice.getName()==juice.getproductname(2)&& !(juice.getStock(2)==0)) {
						juice.Stock2.deleteNode();
						juice.setMiounsStock(2);
					}
					else if(juice.getName()==juice.getproductname(3)&& !(juice.getStock(3)==0)) {
						juice.Stock3.deleteNode();
						juice.setMiounsStock(3);
					}
					else if(juice.getName()==juice.getproductname(4)&& !(juice.getStock(4)==0)) {
						juice.Stock4.deleteNode();
						juice.setMiounsStock(4);
					}
					else JOptionPane.showMessageDialog(null, "������ �߸��Ǿ����ϴ�");
					
					/*�ֹ� ������ �Ϸ�Ǹ� ���, �ܾ�, ���ͱ�(���ͱ�) ����*/
					juice.setMoney(juice.getMoney()-juice.getPrice());
					juice.setProfit_money(juice.getPrice()+juice.getProfit_money());
					JOptionPane.showMessageDialog(null, "���� ����!");
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, juice.getName()+" ��� �����ϴ�.");				//deletNode �� ������ �� ��� ����ó��  
					
				}
				
				
			}
			
			
			}
			viewProductLabel.setText("");
			String to = Integer.toString(juice.getMoney());
			lblNewLabel.setText(to);
			juice.setName(null);
			juice.setPrice(0);
		}
		
		public void change_password() {
			
			JPanel panel = new JPanel();
			JLabel label = new JLabel("���ο� ��й�ȣ�� �Է��ϼ���:");
			JPasswordField pass = new JPasswordField(10);
			panel.add(label);
			panel.add(pass);
			String[] options = new String[]{"����", "���"};
			int option = JOptionPane.showOptionDialog(null, panel, "��й�ȣ ����",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) // ���� ��ư�� ������ �� 
			{
			    char[] password = pass.getPassword();
			    String pasww = new String(password);   
			    String pwPattern ="^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,12}$";	//����,����,Ư������		    		
			    Matcher matcher = Pattern.compile(pwPattern).matcher(pasww);
			    System.out.println(pasww);
	
			    if(matcher.find()){
			        juice.setpassword(pasww);
			        JOptionPane.showMessageDialog(null, "��й�ȣ�� ����Ǿ����ϴ�!");
			    }
			    else {
			    	JOptionPane.showMessageDialog(null, "8~12�� �̳�, ���� �� Ư�����ڸ� �ϳ� �̻� �����ϼ���!");
			    }
			    }
			   
			}
		
		public void check_password() {
			JPanel panel = new JPanel();
			JLabel label = new JLabel("���� ��й�ȣ�� �Է��ϼ���:");
			JPasswordField pass = new JPasswordField(10);
			panel.add(label);
			panel.add(pass);
			String[] options = new String[]{"Ȯ��", "���"};
			int option = JOptionPane.showOptionDialog(null, panel, "��й�ȣ üũ",
			                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
			                         null, options, options[1]);
			if(option == 0) // pressing OK button
			{
			    char[] password = pass.getPassword();
			    String pasww = new String(password);
			    if(juice.getpassword().equals(pasww))
			    {
			    	 System.out.println(new String(password)==juice.getpassword());
			    	JOptionPane.showMessageDialog(null, "��й�ȣ ��ġ!");
			    	change_password();
			    }
			    else {
			    System.out.println("Your password is: " + new String(password));
			    JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�!");
			    }
			    }
		}
		
	
		
		}

		
		

		

	


