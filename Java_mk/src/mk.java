import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//�̹��� Ŭ���� ����


class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null); //�ۼַ�Ʈ ���̾ƿ� 
		
	}
	public void painComponet(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
}




public class mk {
	 JScrollPane scrollPane;
	  ImageIcon icon;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mk window = new mk();
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
	public mk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		icon = new ImageIcon("./image/back.jpg");
		frame = new JFrame();
		
		frame.setTitle("�α� ���Ǳ�");
		frame.setVisible(true);
		JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
       
                g.drawImage(icon.getImage(), 0, 0, null);
               
                super.paintComponent(g);
            }
        };
       
		
		

		frame.getContentPane();
		
//		frame.setResizable(false);  		//ȭ�� ũ�� �������� x
		frame.setLocationRelativeTo(null);
		Main frame = new Main();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(457, 506);
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
