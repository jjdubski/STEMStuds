import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Frame extends JFrame implements ActionListener{
	
	JButton button1;
	Frame() {

		button1 = new JButton();
		button1.setBounds(200, 100, 100, 50);
		button1.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button1);	
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			System.out.println("bro");
		}
	}
	
}
