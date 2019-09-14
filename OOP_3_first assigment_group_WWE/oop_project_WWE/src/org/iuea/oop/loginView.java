package org.iuea.oop;

	import java.awt.Color;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener; 
	import javax.swing.JTextField;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
	import javax.swing.JButton;
	import javax.swing.JComponent;

		
	public class loginView extends JComponent {
		public loginView() {
			
			JFrame A= new JFrame();
			A.setBounds(1000, 200, 500, 400);
			A.setTitle("Login Page");
			A.getContentPane().setBackground(Color.gray);
			A.setLayout(null);
			
			
			 JLabel title= new JLabel("SIGN IN");
			 A.getContentPane().add(title);
			 title.setBounds(240,20,400,100);
			 
			 
       //LoginView L = new LoginView();
       //f.getContentPane().add(L);
	
//labels
			
JLabel b= new JLabel();
b.setText("USERNAME :");
b.setBounds(100	, 30, 300, 200);
A.add(b);
JLabel bb= new JLabel();
bb.setText("PASSWORD :");
bb.setBounds(100, 70, 300, 200);
A.add(bb);
		
//text field
		
JTextField NN = new JTextField(); //username
NN.setBounds(190, 120, 150, 30);
A.add(NN);

JTextField ZZ = new JTextField(); //password
ZZ.setBounds(190, 160, 150, 30);
A.add(ZZ);
		
//buttons
		
JButton XX = new JButton("Login"); //Login button
XX.setBounds(100, 220, 120, 25);
A.add(XX);
		
JButton btlogin = new JButton("Cancel"); //cancel button
btlogin.setBounds(300, 220, 120, 25);
A.add(btlogin);
A.setVisible(true);
A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

XX.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent arg0) {
		
		String uname=NN.getText();
		String pass=ZZ.getText();
		
		if (uname.equals("junior") && pass.equals("07944")) {
		
		JOptionPane.showMessageDialog(A, "you are successfully logged in");
		}
	
		else
		{
			JOptionPane.showMessageDialog(A, "invalid user name or password");

		}
		//ABELI MASHAKA JUNIOR 18/1098/ BSCS-S
		//IRAGI MIHIGO ROLAND 18/856/BSCS-S 
		//SEBASTIEN RAMAZANI 18/970/BSCS-S 
		//ISABU MANZIAMA SARAH 18/1123/BIT-S 

	}

	});
}}
	
	
	
	
	
	
	

		

		
	
	

