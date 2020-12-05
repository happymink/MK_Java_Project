import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		JLabel label = new JLabel("ddd");
		Juice juice = new Juice();
		
		String product_name[] = {juice.getproductname(0),juice.getproductname(1),juice.getproductname(2),juice.getproductname(3),juice.getproductname(4)}; 
	//	int [] Price = {juice.getproductprice(0),juice.getproductprice(1),juice.getproductprice(2),juice.getproductprice(3),juice.getproductprice(4)};
		String Strprice[] = {"0","0","0","0","0"};
		for(int i = 0; i<5; i++) {
			Strprice[i] = Integer.toString(juice.getproductprice(i));
			System.out.println(Strprice[i]);
		}
//		namecombo = new JComboBox<String>(product_name);
//		panel.add(namecombo, BorderLayout.CENTER);
		setSize(380, 380);
		setTitle("메뉴 수정");
		setLocation(900, 100);
		setLayout(null);
	
		JComboBox namecombo = new JComboBox(product_name);

			
		panel.setBounds(0, 0, 400, 400);
		getContentPane().add(panel);
		panel.setLayout(null);
		setLocation(900, 100);
		getContentPane().setLayout(null);
		
		panel.add(label);
		panel.add(namecombo);
		setVisible(true);
		
		
		
	}
}
