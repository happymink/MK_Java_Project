import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SellListUI extends JFrame{
	Juice juice = new Juice();
	SellDB sdb = new SellDB();

public SellListUI() {
	setSize(550, 620);
	setVisible(true);
	setLocation(900, 100);
	getContentPane().setLayout(null);
	
	Object product_name[] = {juice.getproductname(0),juice.getproductname(1),juice.getproductname(2),juice.getproductname(3),juice.getproductname(4)}; 
	
	Object [][] today_sell = new Object [1][5]; 
	
	today_sell[0][0]= juice.getsell_list(0);
	today_sell[0][1]= juice.getsell_list(1);
	today_sell[0][2]= juice.getsell_list(2);
	today_sell[0][3]= juice.getsell_list(3);
	today_sell[0][4]= juice.getsell_list(4);
	
	
	String [][] data = sdb.getlist();
	String[] headers = new String[] {"상품 명", "가격", "시간"};
	
	JPanel panel = new JPanel();
	panel.setBounds(0, 0, 534, 620);
	getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lblNewLabel_1 = new JLabel("판매 현황");  //판매 현황
	lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
	lblNewLabel_1.setBounds(39, 26, 100, 20);
	panel.add(lblNewLabel_1);
	
	/*	JTable 선언 	*/
	DefaultTableModel model = new DefaultTableModel(today_sell , product_name);
	JTable table = new JTable(model);
	//table = new JTable(model);
	model.fireTableDataChanged();
	table.setBounds(39, 25, 250, 150);
	panel.add(table);
	
	JScrollPane scrollPane = new JScrollPane(table);
	scrollPane.setBounds(39, 57, 450, 120);
	panel.add(scrollPane);
	
	/*	판매 히스토리 JTable 선언*/
	DefaultTableModel model2 = new DefaultTableModel(data , headers);
	JTable table2 = new JTable(model2);
	//table = new JTable(model);
	model.fireTableDataChanged();
	table2.setBounds(39, 200, 250, 150);
	panel.add(table2);
	
	JScrollPane scrollPane2 = new JScrollPane(table2);
	scrollPane2.setBounds(39, 200, 450, 120);
	panel.add(scrollPane2);
	
	JButton btnNewButton0 = new JButton("매출 확인");  //오늘의 매출 확인 버튼
	btnNewButton0.setBounds(40, 350, 80, 40);
	btnNewButton0.setFont(new Font("굴림", Font.BOLD, 10));
	btnNewButton0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int todaysell;
			
			todaysell = juice.getproductprice(0) * juice.getsell_list(0)+
						juice.getproductprice(1) * juice.getsell_list(1)+
						juice.getproductprice(2) * juice.getsell_list(2)+
						juice.getproductprice(3) * juice.getsell_list(3)+
						juice.getproductprice(4) * juice.getsell_list(4);
			
			JOptionPane.showMessageDialog(null," 오늘의 매출은 :"+todaysell+" 원 입니다." );
		
		}
	});
	panel.add(btnNewButton0);
}
	
}