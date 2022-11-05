import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Frame extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	double number3=0;
	JTextField textBox1;
	JTextField textBox2;
	double number1;
	double number2;
	String StringNum1;
	String StringNum2;
	
	Frame() {

		button1 = new JButton();
		button1.setText("do math");
		button1.setBounds(50,100,100,50);
		button1.addActionListener(this);
		
		button2 = new JButton();
		button2.setText("input numbers into system");
		button2.setBounds(200,100,200,50);
		button2.addActionListener(this);
		
		textBox1 = new JTextField();
		textBox1.setText("enter number 1");
		textBox1.setBounds(150,200,100,50);
		textBox1.addActionListener(this);
	
		
		/*textBox2 = new JTextField();
		textBox2.setText("enter number 2");
		textBox2.setBounds(300,200,100,50);
		textBox2.addActionListener(this);*/
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button1);
		this.add(button2);
		this.add(textBox1);
		//this.add(textBox2);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button2) {
			StringNum1 = textBox1.getText();
			number1=Integer.parseInt(StringNum1);
			textBox1.setText("");
			/*StringNum2 = textBox2.getText();
			number2=Integer.parseInt(StringNum2);
			textBox2.setText("");*/
		}
		
		if(e.getSource()== button1) {
			Math bro = new Math(number1, number2);
			number3 = bro.doMath()+number3;
			System.out.println(number3);
			
		}
	}
	
}
