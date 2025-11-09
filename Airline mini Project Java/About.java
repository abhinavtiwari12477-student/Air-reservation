import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class About extends JFrame{
	About(){
		setLayout(null);
		
		   getContentPane().setBackground(new Color(32, 30, 67));
		
		JLabel label=new JLabel("Our project is Airline reservation .In this project we have created an app of it!");
		label.setFont(new Font("Arial",Font.BOLD,30));
		label.setForeground(new Color(238, 238, 238));
		label.setBounds(300,50,1200,40);
		add(label);
		
		
		JLabel l1=new JLabel("Where the user gets login to app and then the user gets various option  ");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setForeground(new Color(238, 238, 238));
		l1.setBounds(300,160,2000,40);
		add(l1);
		
		JLabel l2=new JLabel(" like Flight details , Booking Flight and Customer care  ");
		l2.setFont(new Font("Arial",Font.BOLD,30));
		l2.setForeground(new Color(238, 238, 238));
		l2.setBounds(300,220,2000,30);
		add(l2);
		
		
		
		JButton button=new JButton("Home page");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				new Home();
			}
		});
		button.setBounds(350,550,150,20);
		add(button);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setForeground(Color.BLACK);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

  public static void main(String args[]){
	new About();
}}