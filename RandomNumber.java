import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//import AWTCounter.BtnCountListener;

public class RandomNumber extends Frame{
	//initialize some public components and variables
	private TextField UserInput;
	private TextField Alert;
	public Random random = new Random();
	
	public RandomNumber() {
		
		
		// New label to display the large numbers 123
		Label entry = new Label("1.2.3.", Label.CENTER);
		entry.setBackground(Color.yellow);
		entry.setFont(new Font("Serif", Font. BOLD, 70));
		add(entry,BorderLayout.NORTH);
		
		//the user input textfield
		UserInput = new TextField(10);
		UserInput.setBounds(50,100,200,30);
		add(UserInput);
		
		//register the userinput action listener
		UserInput.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evt) {
				//get the string entered into the texfield userinput and convert to int
				int numberIn = Integer.parseInt(UserInput.getText());
				int x = random.nextInt(100);
				
				//compare the random number and the userinput
				if (numberIn == x) {
					Alert.setText("you input is correct");
					System.out.println("you input is correct");
				}else if(numberIn < x) {
					Alert.setText("you input is low");
					System.out.println("you input is low");
				}else if(numberIn > x) {
					Alert.setText("your input is high");
					System.out.println("your input is high");
				}else {
					Alert.setText("try again");
					System.out.println("try again");
				}
				
				UserInput.setText("");				
			}
				
		});
			
		//Alert the user where their value lies upon comparison
		Alert = new TextField(100);
		Alert.setSize(30, 10);
		Alert.getSize();
		Alert.setFont(new Font("Serif", Font. BOLD, 20));
		add(Alert);
		Alert.setEditable(false);
		
		//Create a new click me button
		Button Clickme;
		Clickme = new Button("Click me");
		Clickme.setBounds(50,100,200,300);
		
		Clickme.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evt) {
				//get the string entered into the texfield userinput and convert to int
				int numberIn = Integer.parseInt(UserInput.getText());
				int x = random.nextInt(100);
				
				//compare the random number and the userinput
				if (numberIn == x) {
					Alert.setText("you input is correct");
					System.out.println("you input is correct");
				}else if(numberIn < x) {
					Alert.setText("you input is low");
					System.out.println("you input is low");
				}else if(numberIn > x) {
					Alert.setText("your input is high");
					System.out.println("your input is high");
				}else {
					Alert.setText("try again");
					System.out.println("try again");
				}
				
				UserInput.setText("");				
			}
			
		});
			
		
		//create a new reset button
		Button Restart = new Button("Restart");
		Restart.setBounds(50,100,200,300);
		
		
		//action listener for the button
		
		
		//Create a new panel that we can insert the two textfields
		Panel panel=new Panel(new GridBagLayout());
		//panel.setLayout(new GridBagLayout());
        //panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.gray);
        add(panel);
        
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);
        
        c.gridx = 0;
        c.gridy = 1;
        
        panel.add(UserInput,c);
        
        c.gridx =0;
        c.gridy =-1;
        panel.add(Alert,c);
        
        panel.add(Clickme,c);
        c.gridx=1;
        c.gridy=-2;
        
        panel.add(Restart);
        c.gridx=0;
        c.gridy=-3;
		
		//code for window closing
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				dispose();
			}
		});
		
		setTitle("Random number comparison");
		setSize(400,400);
		setVisible(true);
		//setLayout(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomNumber();

	}
			
}


