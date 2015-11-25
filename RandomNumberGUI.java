import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RandomNumberGUI {
	//Number declerations
	int lowLimit;
	int upLimit;
	int number;
	String numberString;
	//Gui Declarations
	private JFrame frame;
	private JButton button;
	private JLabel title;
	private JLabel explenation;
	private JTextField upLimitField;
	private JTextField lowLimitField;
	private JTextField generatedNumberField;
	
	public static void main (Spring[] args) {
		
		//declaring all the things that go into the GUI
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton ("Gimme a Number"); // One Button to start create a Random Number
		JLabel title = new JLabel("Random Number Widget");
		JLabel explenation = new JLabel("Put in the Range in which your Random Number should be in and hit the Random Button");
		JTextField upLimitField = new JTextField(12);
		JTextField lowLimitField = new JTextField(12);
		JTextField generatedNumberField = new JTextField(3);
		
		//Frame stuff
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setVisible(true);
		
		//Stuff settings
		panel.setBackground(Color.black);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		lowLimitField.setText("Low Number"); //Lowest Possibe Number
		upLimitField.setText("High Number"); //Highest Possible Number
		//button.addActionListener(new RandomListener());
		
		//Putting all the Stuff into the Frame and panel
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		panel.add(title);
		panel.add(explenation);
		panel.add(upLimitField);
		panel.add(lowLimitField);
		panel.add(button);
		panel.add(generatedNumberField);
		
	} //main end
	class RandomListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			lowLimit = Integer.parseInt(lowLimitField.getText());
			upLimit = Integer.parseInt(upLimitField.getText());
			RandomNumber r = new RandomNumber();
			number = r.number (lowLimit, upLimit);
			numberString = Integer.toString(number);
			generatedNumberField.setText(numberString);
		}
	}
} // Class end

