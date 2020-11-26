import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InsertCoin extends JDialog {
	Juice juice = null;
	public InsertCoin(Window parent, JLabel label) {
		super(parent, "Insert Coin", ModalityType.APPLICATION_MODAL);
		setSize(400,260);
		setLayout(null);
		JLabel lb = new JLabel("»≠∆Û∏¶ º±≈√«œººø‰");
		lb.setFont(new Font("±º∏≤", Font.PLAIN, 12));
		lb.setBounds(140,0,100,50);
		
		JButton btn = new JButton("1000");
		btn.setBounds(50, 130, 80, 40);
		juice = new Juice();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		add(lb);
		add(btn);
	}


}
