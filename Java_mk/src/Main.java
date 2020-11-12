import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
 
public class Main extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
 
    public Main() {
        icon = new ImageIcon("./image/back.jpg");
       
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
       
                g.drawImage(icon.getImage(), 0, 0, null);
               
                super.paintComponent(g);
            }
        };
       
       
       
        JButton button = new JButton("버튼");
        background.add(button);
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
    }
 
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(457, 506);
        frame.setVisible(true);
    }
}
