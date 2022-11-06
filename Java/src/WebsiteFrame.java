import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WebsiteFrame extends JFrame implements ActionListener{

	JButton buttonInput;
	JTextField textBoxInput;
	WebsiteFrame() {
	JLabel labelTitle = new JLabel();
	labelTitle.setBounds(500,10,120,70);
	labelTitle.setText("CANDY EXCHANGE");
	
	buttonInput = new JButton();
	buttonInput.setBounds(800,200,120,70);
	buttonInput.setText("Submit");
	
	textBoxInput = new JTextField();
	textBoxInput.setBounds(400,200,180,70);
	textBoxInput.setText("Enter Number of Candy");
	textBoxInput.setHorizontalAlignment(JTextField.CENTER);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.setSize(1200,675);
	this.setVisible(true);
	this.add(buttonInput);
	this.add(labelTitle);
	this.add(textBoxInput);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== buttonInput) {
		}
	}


}
