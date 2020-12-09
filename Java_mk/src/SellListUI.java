import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SellListUI extends JFrame{
}

public sellListui() {
	setSize(550, 620);
	setVisible(true);
	setLocation(900, 100);
	getContentPane().setLayout(null);
	
	
	JPanel panel = new JPanel();
	panel.setBounds(0, 0, 534, 198);
	getContentPane().add(panel);
	panel.setLayout(null);
	
	/*	JTable ¼±¾ð 	*/
	DefaultTableModel model = new DefaultTableModel(juicearr , product_name);
	JTable table = new JTable(model);
	//table = new JTable(model);
	model.fireTableDataChanged();
	table.setBounds(39, 25, 250, 150);
	panel.add(table);
	
	JScrollPane scrollPane = new JScrollPane(table);
	scrollPane.setBounds(39, 57, 450, 120);
	panel.add(scrollPane);
}
}