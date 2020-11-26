import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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

public class First extends JFrame {

	private JFrame frame;

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

	/**
	 * Create the application.
	 */
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setSize(477, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("민균 자판기"); //타이틀 이름 설정
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		ImagePanel testpanel = new ImagePanel (new ImageIcon("C:\\Users\\민균\\git\\MK_Java_Project\\Java_mk/image/back4.jpg").getImage());
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
//		frame.pack(); //패널 이미지사이즈에 맞게 자동 조정
		frame.getContentPane().add(testpanel);
		
		JLabel viewProductLabel = new JLabel("New label");
		viewProductLabel.setHorizontalAlignment(SwingConstants.CENTER);
		viewProductLabel.setBounds(12, 251, 133, 125);
		testpanel.add(viewProductLabel);
			
		JButton button = new JButton("\u25CF"); //생수
		button.addActionListener(new ActionListener() {

	
			public void actionPerformed(ActionEvent e) {
			
				viewProductLabel.setText("<html><body>상품명:생수<br>가격 : 350원</body></html>");
				}
			
		});
		button.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button.setBounds(27, 108, 55, 21);
		testpanel.add(button);
		
		JButton button_1 = new JButton("\u25CF"); //일반 커피
		button_1.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_1.setBounds(94, 108, 55, 21);
		testpanel.add(button_1);
		
		JButton button_2 = new JButton("\u25CF"); //이온음료
		button_2.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_2.setBounds(159, 108, 55, 21);
		testpanel.add(button_2);
		
		JButton button_3 = new JButton("\u25CF"); //고급 커피
		button_3.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_3.setBounds(222, 108, 55, 21);
		testpanel.add(button_3);
		
		JButton button_4 = new JButton("\u25CF"); //탄산음료
		button_4.setFont(new Font("210 양말구멍 R", Font.PLAIN, 10));
		button_4.setBounds(27, 206, 55, 21);
		testpanel.add(button_4);
		
		JButton btnNewButton = new JButton("COIN");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 9));
		btnNewButton.setBounds(157, 283, 57, 30);
		testpanel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(198, 330, 66, 30);
		testpanel.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(248, 265, 34, 30);
		testpanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setBounds(222, 263, 24, 21);
		testpanel.add(btnNewButton_3);
		
		
		JButton btnNewButton_1 = new JButton("관리자 모드");
		
		btnNewButton_1.setBounds(320, 51, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
	}
	
}
