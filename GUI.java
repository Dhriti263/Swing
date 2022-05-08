package myjavaprojects;

import java.awt.Component;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private static JPanel panel;
	private static JFrame frame;
	private  static JLabel userlabel;
	private static JLabel passlabel;
	private static JTextField userText;
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		panel=new JPanel();
		
		frame=new JFrame();
		frame.setSize(600,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userlabel=new JLabel("User");
		userlabel.setBounds(30,40,100,20);
		panel.add(userlabel);
		
		userText=new JTextField(20);
		userText.setBounds(140, 40,300,30);
		panel.add(userText);
		
		passlabel=new JLabel("Password");
		passlabel.setBounds(30, 100,100, 20);
		panel.add(passlabel);
		
	    passText=new JPasswordField();
		passText.setBounds(140, 100,300,30);
		panel.add(passText);
		
		 button=new JButton("Login");
		button.setBounds(70,200,80,30);
		button.addActionListener(new GUI());
		panel.add(button);
		
	    success=new JLabel("");
		success.setBounds(200, 200, 150, 30);
		panel.add(success);
		
		frame.setVisible(true);
		

	}

	
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String user=userText.getText();
		String password=passText.getText();
	    System.out.println(user+" ,"+password);
	    if(user.equals("Sudipta") && password.equals("Dhriti@263")) {
	    	success.setText("Logged-in successfully!");
	    }
		
		
	}

}
