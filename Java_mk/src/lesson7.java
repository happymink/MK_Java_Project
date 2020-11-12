import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	public void painComponet(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
}
public class lesson7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("table prac.");
		JPanel panel = new JPanel();
		String[] headings = new String[] {"Id", "Name", "Country"};
		Object[][] data = new Object[][] {
			{"1", "Minkyun", "Korea"},
			{"2", "Danny", "France"},
			{"3", "jONn", "jApan"}			
			
		};
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		
		table.setFillsViewportHeight(true);
		
		panel.add(new JScrollPane(table));
		frame.add(panel);
			frame.setVisible(true);
			frame.setSize(800,600);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
