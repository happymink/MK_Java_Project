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
		
		/*		 JTable ����� ���� ������Ʈ �迭 ����		 */
		
		Object [][] juicearr = new Object [1][5]; 
					
				juicearr[0][0]= juice.getStock(0);
				juicearr[0][1]= juice.getStock(1);
				juicearr[0][2]= juice.getStock(2);
				juicearr[0][3]= juice.getStock(3);
				juicearr[0][4]= juice.getStock(4);
		
		Object product_name[] = {juice.getproductname(0),juice.getproductname(1),juice.getproductname(2),juice.getproductname(3),juice.getproductname(4)}; 
		
		
		/*������ ������ �� ��Ÿ ��� ����*/
		
		setSize(550, 620);
		setVisible(true);
		setLocation(900, 100);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 534, 198);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		/*	JTable ���� 	*/
		DefaultTableModel model = new DefaultTableModel(juicearr , product_name);
		JTable table = new JTable(model);
		//table = new JTable(model);
		model.fireTableDataChanged();
		table.setBounds(39, 25, 250, 150);
		panel.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(39, 57, 450, 120);
		panel.add(scrollPane);
		
		
	
		/*===================== ��� �ֹ� ��� ======================*/
		
		JLabel lblNewLabel_1 = new JLabel("\uC7AC\uACE0\uD604\uD669");  //��� ��Ȳ
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_1.setBounds(39, 26, 100, 20);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();	//��ǰ �ֹ� �г�
		panel_1.setBounds(0, 180, 534, 371);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnNewButton0 = new JButton(juice.getproductname(0));  //��ǰ 0 ����  ��ư
		btnNewButton0.setBounds(30, 61, 80, 40);
		btnNewButton0.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(0) >= 3) {
					JOptionPane.showMessageDialog(null, "�ֹ� ���� <���� �ִ� ����Դϴ�>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(0)+"> ��� �ֹ��Ͻðڽ��ϱ�?\n",
						"��� �ֹ� Ȯ�� â", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(0));
					JOptionPane.showMessageDialog(null, "�ֹ� ����");
				}
					
				}// pressing OK button
			
			}
		});

		JButton btnNewButton1 = new JButton(juice.getproductname(1));  //��ǰ 1(�Ϲ� Ŀ��) ��ư
		btnNewButton1.setBounds(120, 61, 80, 40);
		btnNewButton1.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(1) >= 3) {
					JOptionPane.showMessageDialog(null, "�ֹ� ���� <���� �ִ� ����Դϴ�>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(1)+"> ��� �ֹ��Ͻðڽ��ϱ�?\n",
						"��� �ֹ� Ȯ�� â", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(1));
					JOptionPane.showMessageDialog(null, "�ֹ� ����");
				}
					
				}// pressing OK button
			}
			
		});
		JButton btnNewButton2 = new JButton(juice.getproductname(2));  //��ǰ 2(�̿� ����) ��ư
		btnNewButton2.setBounds(210, 61, 80, 40);
		btnNewButton2.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(2) >= 3) {
					JOptionPane.showMessageDialog(null, "�ֹ� ���� <���� �ִ� ����Դϴ�>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(2)+"> ��� �ֹ��Ͻðڽ��ϱ�?\n",
						"��� �ֹ� Ȯ�� â", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(2));
					JOptionPane.showMessageDialog(null, "�ֹ� ����");
				}
					
				}// pressing OK button
			}
			
		});
		JButton btnNewButton3 = new JButton(juice.getproductname(3));  //��ǰ 3(��� Ŀ��) ��ư
		btnNewButton3.setBounds(300, 61, 80, 40);
		btnNewButton3.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(3) >= 3) {
					JOptionPane.showMessageDialog(null, "�ֹ� ���� <���� �ִ� ����Դϴ�>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(3)+"> ��� �ֹ��Ͻðڽ��ϱ�?\n",
						"��� �ֹ� Ȯ�� â", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(3));
					JOptionPane.showMessageDialog(null, "�ֹ� ����");
				}
					
				}// pressing OK button
			
			}
		});
		JButton btnNewButton4 = new JButton(juice.getproductname(4));  //��ǰ 4 (ź�� ����) ��ư
		btnNewButton4.setBounds(390, 61, 100, 40);
		btnNewButton4.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			//	new InventoryUI();
				if (juice.getStock(4) >= 3) {
					JOptionPane.showMessageDialog(null, "�ֹ� ���� <���� �ִ� ����Դϴ�>");
				}
				else {
				int ans = JOptionPane.showConfirmDialog(null, "<"+juice.getproductname(4)+"> ��� �ֹ��Ͻðڽ��ϱ�?\n",
						"��� �ֹ� Ȯ�� â", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					juice.PlusStock(juice.getproductname(4));
					JOptionPane.showMessageDialog(null, "�ֹ� ����");
				}
				}
				}// pressing OK button
			
			
		});
	
		/*===================== ��� �ֹ� ���  END======================*/
		
		
		
		
		/* ��ǰ �ֹ� ���̺� */
		JLabel lblNewLabel_2 = new JLabel("\uBB3C\uD488\uC8FC\uBB38");   
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 14));
		lblNewLabel_2.setBounds(30, 30, 100, 15);
		panel_1.add(lblNewLabel_2);
		
		/*������ ��� ���̺�*/
		lblNewLabel = new JLabel("������ ���"); 
		lblNewLabel.setFont(new Font("����", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 115, 450, 30);
		panel_1.add(lblNewLabel);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 541, 534, 120);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		/*�޴� ���� ��ư */
		JButton btnNewButton_1 = new JButton("�޴� ����");
		btnNewButton_1.setBounds(30, 150, 80, 40);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new Editmenu();
			
			}
		});
		
		/*���ΰ�ħ ��ư */
		JButton btnNewButton_2 = new JButton("���ΰ�ħ");
		btnNewButton_2.setBounds(120, 150, 80, 40);
		btnNewButton_2.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InventoryUI();

			
			}
		});
	
		JButton btnNewButton_4 = new JButton("�ܵ� Ȯ��");  //�ܵ� Ȯ�ι�ư
		btnNewButton_4.setBounds(300, 150, 80, 40);
		btnNewButton_4.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String text;
				text = "10: " + juice.getCoinWallet(0)+"��  "
						+"50: " + juice.getCoinWallet(1)+"��  "
						+"100: " + juice.getCoinWallet(2)+"��  "
						+"500: " + juice.getCoinWallet(3)+"��  "
						+"1000 :" + juice.getCoinWallet(4)+"��  ";
			JOptionPane.showMessageDialog(null, text);
			}
		});
	
		
		JButton btnNewButton_3 = new JButton("�ݾ� ȸ��");  //���� Ȯ��
		btnNewButton_3.setBounds(210, 150, 80, 40);
		btnNewButton_3.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ȸ�� ���� �ݾ��� <"+juice.getProfit_money()+"> �� �Դϴ�");
				new takeback_CoinUI();
			}
		});
		
		JButton btnNewButton_5 = new JButton("�ܵ� �ʱ�ȭ");  //�ܵ� �ʱ�ȭ
		btnNewButton_5.setBounds(390, 150, 100, 40);
		btnNewButton_5.setFont(new Font("����", Font.BOLD, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int ans = JOptionPane.showConfirmDialog(null, "��� �ܵ��� ȸ���ϰ� 5���� ���ܵӴϴ�",
						"�ܵ� �ʱ�ȭ", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				if (ans == 0) {
					for(int i = 0 ; i<5 ; i++) {								//YES >> CoinWallet ��� ��Ҹ� 5�� �ʱ�ȭ �� �� ���ͱݵ� �⺻���� ����
						juice.setCoinWallet(i, 5);
					}
					juice.setProfit_money(1000*5 + 500*5 + 100*5 + 50*5 + 10*5);
					JOptionPane.showMessageDialog(null, "�ʱ�ȭ ����");
				}
			}
		});
		
		/*	�гο� ��ư �߰�    */
		
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
