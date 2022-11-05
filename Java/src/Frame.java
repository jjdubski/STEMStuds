import javax.swing.JButton;
import javax.swing.JFrame;
public class Frame extends JFrame {
	
	Frame() {

		JButton button1 = new JButton();
		button1.setBounds(200, 100, 100, 50);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button1);
	}
	
}
