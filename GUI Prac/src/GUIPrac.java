import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GUIPrac {
	public static void main(String[] args) {
		
			
		JLabel label = new JLabel();
		ImageIcon logo = new ImageIcon("logoVending.png");
		label.setText("Fruit Juice Vending Machine");
		label.setIcon(logo);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setIconTextGap(100);
		label.setForeground(Color.white);
		
		JButton startButton = new JButton();
		startButton.setBounds(20, 10, 10, 5);
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1000,700);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Fruit Juice Machine");
		
		
		
		frame.setIconImage(logo.getImage());
		frame.getContentPane().setBackground(new Color(0x424B54));
		frame.add(label);
	//	frame.add(startButton);
	//	JOptionPane pane = new JOptionPane();
		
	}
}
