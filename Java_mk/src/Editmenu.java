import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Editmenu extends JFrame {
	Container container = getContentPane();
	Panel panel =new Panel();
	Juice juice = new Juice();
	private JTextField textField;
	JLabel label = new JLabel();
//	JComboBox<String> namecombo;
//	JComboBox<String> pricecombo;
	JComboBox combo = new JComboBox();


	
	String temp;
	public Editmenu(){
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		Juice juice = new Juice();
		String new_name = "";
		int new_price ;
		String product_name[] = {juice.getproductname(0),juice.getproductname(1),juice.getproductname(2),juice.getproductname(3),juice.getproductname(4)}; 
	//	int [] Price = {juice.getproductprice(0),juice.getproductprice(1),juice.getproductprice(2),juice.getproductprice(3),juice.getproductprice(4)};
		String Strprice[] = {"0","0","0","0","0"};
		
		for(int i = 0; i<5; i++) {
			Strprice[i] = Integer.toString(juice.getproductprice(i));
		}
		
		JComboBox namelist = new JComboBox(product_name);
		JTextField namefield = new JTextField(10);
		JComboBox pricelist = new JComboBox(Strprice);
		JTextField pricefield = new JTextField(10);
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		
		namelist.setBounds(80,40,100,20);
		namefield.setBounds(80,70,100,20);
		
		pricelist.setBounds(80,120,100,20);
		pricefield.setBounds(80,150,100,20);
		setSize(300, 300);
		setTitle("메뉴 수정");
		setLocation(900, 100);
		setLayout(null);

		label1.setText("메뉴 명:");
		label1.setBounds(30,40,100,20);
		label2.setText("가격:");
		label2.setBounds(30,120,100,20);
		
		btn1.setBounds(200,50,40,40);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			if (namelist.getSelectedItem().toString() == juice.getproductname(0)) {
				juice.setproductname(0, namefield.getText());}
			else if (namelist.getSelectedItem().toString() == juice.getproductname(1)) {
				juice.setproductname(1, namefield.getText());}
			else if  (namelist.getSelectedItem().toString() == juice.getproductname(2)) { 
				juice.setproductname(2, namefield.getText());}
			else if  (namelist.getSelectedItem().toString() == juice.getproductname(3)) { 
				juice.setproductname(3, namefield.getText());}
			else if(namelist.getSelectedItem().toString() == juice.getproductname(4)) {
				juice.setproductname(4, namefield.getText());}
			JOptionPane.showMessageDialog(null, "변경 완료");
			
			}});
		btn2.setBounds(200,130,40,40);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp = Integer.parseInt(pricelist.getSelectedItem().toString()); 	//combobox 요소를 문자열 ㅡ> 정수형으로 변환
				int a = Integer.parseInt(pricefield.getText());							//price 텍스트 필드의 값을 정수형으로 변환 후  변수 a에 저장
			if  (temp == juice.getproductprice(0)) {								//콤보박스의 요소를 0,1,2,3,4 번째 인덱스로 각각 표현
				juice.setproductprice(0, a);}
			else if (temp == juice.getproductprice(1)) {
				juice.setproductprice(1, a);}
			else if  (temp== juice.getproductprice(2)) { 
				juice.setproductprice(2, a);}
			else if  (temp == juice.getproductprice(3)) { 
				juice.setproductprice(3, a);}
			else if	 (temp == juice.getproductprice(4)) {
				juice.setproductprice(4, a);}
			JOptionPane.showMessageDialog(null, "변경 완료");
			
			}});
		
		
		panel.setBounds(0, 0, 400, 400);
		getContentPane().add(panel);
		panel.setLayout(null);
		setLocation(900, 100);
		getContentPane().setLayout(null);
		
		panel.add(label1);
		panel.add(label2);
		panel.add(namelist);
		panel.add(namefield);
		panel.add(pricelist);
		panel.add(pricefield);
		panel.add(btn1);
		panel.add(btn2);
		
		
		
		setVisible(true);
		
		
		
		}}
	
