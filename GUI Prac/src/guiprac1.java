import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class guiprac1 {
	public static void main (String[] args) {
		JFrame frame = new JFrame(); // creates the frame
		frame.setSize(590,420); // sets the size of the frame
		frame.setTitle("Sure na mo mu NO mo??!!"); //sets the title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit when x is pressed
		frame.setResizable(false); //makes the frame not resizable
		frame.setVisible(true); // makes the frame visible
		
		ImageIcon image = new ImageIcon("logo.png"); // creates an image icon
		frame.setIconImage(image.getImage());// change the image icon
		
		frame.getContentPane().setBackground(Color.gray); // change color of background	
		frame.getContentPane().setBackground(new Color(0xA2DBF5)); //if you want to use specific hexadecimal color value, use 0x before it not #
		
	}
}
