import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class InventoryUI extends JFrame {
	Container container = getContentPane();
	Panel pal =new Panel();
	Juice juice = new Juice();
	private JTable table;
	String stockname;
	private JTextField textField;
	JLabel lblNewLabel;
	Queue1 q = new Queue1();
	
	public InventoryUI(){
		
		/*		 JTable 사용을 위한 오브젝트 배열 선언		 */
		
		Object [][] juicearr = new Object [1][5]; 
					
				juicearr[0][0]= juice.getStock(0);
				juicearr[0][1]= juice.getStock(1);
				juicearr[0][2]= juice.getStock(2);
				juicearr[0][3]= juice.getStock(3);
				juicearr[0][4]= juice.getStock(4);
		
		Object product_name[] = {juice.getproductname(0),juice.getproductname(1),juice.getproductname(2),juice.getproductname(3),juice.getproductname(4)}; 
		
		
		/*프레임 사이즈 및 기타 기능 설정*/
		
		setSize(550, 620);
		setVisible(true);
		setLocation(900, 100);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 534, 198);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		/*	JTable 선언 	*/
		DefaultTableModel model = new DefaultTableModel(juicearr , product_name);
		JTable table = new JTable(model);
		//table = new JTable(model);
		model.fireTableDataChanged();
		table.setBounds(39, 25, 250, 150);
		panel.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(39, 57, 450, 120);
		panel.add(scrollPane);
		
		
	
		/*===================== 재고 주문 기능 ======================*/
		
		JLabel lblNewLabel_1 = new JLabel("\uC7AC\uACE0\uD604\uD669");  //재고 현황
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1.setBounds(39, 26, 100, 20);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();	//물품 주문 패널
		panel_1.setBounds(0, 180, 534, 371);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnNewButton0 = new JButton(juice.getproductname(0));  //물품 0 생수  버튼
		btnNewButton0.setBounds(30, 61, 80, 40);
		btnNewButton0.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(0) >= 3) {
					JOptionPane.showMessageDialog(null, "주문 실패 <현재 최대 재고입니다>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(0)+"> 재고를 주문하시겠습니까?\n",
						"재고 주문 확인 창", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(0));
					JOptionPane.showMessageDialog(null, "주문 성공");
				}
					
				}// pressing OK button
			
			}
		});

		JButton btnNewButton1 = new JButton(juice.getproductname(1));  //물품 1(일반 커피) 버튼
		btnNewButton1.setBounds(120, 61, 80, 40);
		btnNewButton1.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(1) >= 3) {
					JOptionPane.showMessageDialog(null, "주문 실패 <현재 최대 재고입니다>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(1)+"> 재고를 주문하시겠습니까?\n",
						"재고 주문 확인 창", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(1));
					JOptionPane.showMessageDialog(null, "주문 성공");
				}
					
				}// pressing OK button
			}
			
		});
		JButton btnNewButton2 = new JButton(juice.getproductname(2));  //물품 2(이온 음료) 버튼
		btnNewButton2.setBounds(210, 61, 80, 40);
		btnNewButton2.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(2) >= 3) {
					JOptionPane.showMessageDialog(null, "주문 실패 <현재 최대 재고입니다>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(2)+"> 재고를 주문하시겠습니까?\n",
						"재고 주문 확인 창", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(2));
					JOptionPane.showMessageDialog(null, "주문 성공");
				}
					
				}// pressing OK button
			}
			
		});
		JButton btnNewButton3 = new JButton(juice.getproductname(3));  //물품 3(고급 커피) 버튼
		btnNewButton3.setBounds(300, 61, 80, 40);
		btnNewButton3.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(3) >= 3) {
					JOptionPane.showMessageDialog(null, "주문 실패 <현재 최대 재고입니다>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(3)+"> 재고를 주문하시겠습니까?\n",
						"재고 주문 확인 창", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(3));
					JOptionPane.showMessageDialog(null, "주문 성공");
				}
					
				}// pressing OK button
			
			}
		});
		JButton btnNewButton4 = new JButton(juice.getproductname(4));  //물품 4 (탄산 음료) 버튼
		btnNewButton4.setBounds(390, 61, 100, 40);
		btnNewButton4.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(4) >= 3) {
					JOptionPane.showMessageDialog(null, "주문 실패 <현재 최대 재고입니다>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(4)+"> 재고를 주문하시겠습니까?\n",
						"재고 주문 확인 창", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(4));
					JOptionPane.showMessageDialog(null, "주문 성공");
				}
				}
				}// pressing OK button
			
			
		});
	
		/*===================== 재고 주문 기능  END======================*/
		
		
		
		
		/* 물품 주문 레이블 */
		JLabel lblNewLabel_2 = new JLabel("\uBB3C\uD488\uC8FC\uBB38");   
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setBounds(30, 30, 100, 15);
		panel_1.add(lblNewLabel_2);
		
		/*관리자 기능 레이블*/
		lblNewLabel = new JLabel("관리자 기능"); 
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 115, 450, 30);
		panel_1.add(lblNewLabel);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 541, 534, 120);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		/*메뉴 변경 버튼 */
		JButton btnNewButton_1 = new JButton("메뉴 변경");
		btnNewButton_1.setBounds(30, 150, 80, 40);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new Editmenu();
			
			}
		});
		
		/*새로고침 버튼 */
		JButton btnNewButton_2 = new JButton("새로고침");
		btnNewButton_2.setBounds(120, 150, 80, 40);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InventoryUI();

			
			}
		});
	
		JButton btnNewButton_4 = new JButton("잔돈 확인");  //잔돈 확인버튼
		btnNewButton_4.setBounds(300, 150, 80, 40);
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String text;
				text = "10: " + juice.getCoinWallet(0)+"장  "
						+"50: " + juice.getCoinWallet(1)+"장  "
						+"100: " + juice.getCoinWallet(2)+"장  "
						+"500: " + juice.getCoinWallet(3)+"장  "
						+"1000 :" + juice.getCoinWallet(4)+"장  ";
			JOptionPane.showMessageDialog(null, text);
			}
		});
	
		
		JButton btnNewButton_3 = new JButton("금액 회수");  //수금 확인
		btnNewButton_3.setBounds(210, 150, 80, 40);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "회수 가능 금액은 <"+juice.getProfit_money()+"> 원 입니다");
				new takeback_CoinUI();
			}
		});
		
		JButton btnNewButton_5 = new JButton("잔돈 초기화");  //잔돈 초기화
		btnNewButton_5.setBounds(390, 150, 100, 40);
		btnNewButton_5.setFont(new Font("굴림", Font.BOLD, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int ans = JOptionPane.showConfirmDialog(null, "모든 잔돈을 회수하고 5개씩 남겨둡니다",
						"잔돈 초기화", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					for(int i = 0 ; i<5 ; i++) {								//YES >> CoinWallet 모든 요소를 5로 초기화 한 후 이익금도 기본으로 셋팅
						juice.setCoinWallet(i, 5);
					}
					juice.setProfit_money(1000*5 + 500*5 + 100*5 + 50*5 + 10*5);
					JOptionPane.showMessageDialog(null, "초기화 성공");
				}
			}
		});
		
		/*	패널에 버튼 추가    */
		
		panel_1.add(btnNewButton0);
		panel_1.add(btnNewButton1);
		panel_1.add(btnNewButton2);
		panel_1.add(btnNewButton3);
		panel_1.add(btnNewButton4);
	
		panel_1.add(btnNewButton_1);
		panel_1.add(btnNewButton_2);
		panel_1.add(btnNewButton_3);
		panel_1.add(btnNewButton_4);
		panel_1.add(btnNewButton_5);

	}
	
}
