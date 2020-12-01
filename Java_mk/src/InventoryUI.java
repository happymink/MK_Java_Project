import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class InventoryUI extends JFrame {
	Container container = getContentPane();
	Panel pal =new Panel();
	Juice juice = new Juice();
	private JTable table;
	Object[][] a = {{5,5,5,5,5}};
	Object columnNames[] = {"물","일반 커피","이온 음료","고급 커피","탄산 음료"};
	int num;
	String stockname;
	private JTextField textField;
	JLabel lblNewLabel;
	
	public InventoryUI(){
	
		
		num=0;//초기화
	
		
		setSize(550, 620);
		setVisible(true);
		setLocation(900, 100);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 534, 198);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable(a , columnNames);
		table.setBounds(39, 25, 250, 150);
		panel.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(39, 57, 450, 120);
		panel.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("\uC7AC\uACE0\uD604\uD669");  //재고 현황
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_1.setBounds(39, 26, 100, 20);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();	//물품 주문 패널
		panel_1.setBounds(0, 180, 534, 341);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnNewButton = new JButton("\uC6D0\uB450");  //원두 버튼
		btnNewButton.setBounds(30, 61, 80, 40);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				juice.setMoney(juice.getMoney()+5000);
				lblNewLabel.setText("를 주문하실건가요? 수량을 입력하세요.");
				System.out.println(juice.getMoney());
			}
		});
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\uBB3C\uD488\uC8FC\uBB38");   //물품 주문
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2.setBounds(30, 30, 100, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC8FC\uBB38\uC218\uB7C9\uC785\uB825 :");  ///주문 수량 입력
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_3.setBounds(30, 207, 100, 20);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();		
		textField.setBounds(137, 237, 116, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("123");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 285, 450, 30);
		panel_1.add(lblNewLabel);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 541, 534, 120);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		JButton btnNewButton1 = new JButton("주문");  //주문 버튼
		btnNewButton1.setBounds(30, 310, 80, 40);
		panel_1.add(btnNewButton1);
		
		
	}
	
}
