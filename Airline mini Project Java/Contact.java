import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Contact extends JFrame{
	Contact(){
		setLayout(null);
		
		   getContentPane().setBackground(new Color(32, 30, 67));
		
		JLabel label=new JLabel("Hey Everyone !");
		label.setFont(new Font("Arial",Font.BOLD,40));
		label.setForeground(new Color(80, 140, 155));
		label.setBounds(300,50,400,50);
		add(label);
		
		
		JLabel l1=new JLabel("If you have any issue regarding ----  ");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setForeground(new Color(238, 238, 238));
		l1.setBounds(300,160,2000,40);
		add(l1);
		
		JLabel l2=new JLabel("Flight booking  ");
		l2.setFont(new Font("Arial",Font.BOLD,30));
		l2.setForeground(new Color(238, 238, 238));
		l2.setBounds(300,220,2000,30);
		add(l2);
		
		JLabel l14=new JLabel("Flight status  ");
		l14.setFont(new Font("Arial",Font.BOLD,30));
		l14.setForeground(new Color(238, 238, 238));
		l14.setBounds(300,270,2000,30);
		add(l14);
		
		JLabel l15=new JLabel("Refund ");
		l15.setFont(new Font("Arial",Font.BOLD,30));
		l15.setForeground(new Color(238, 238, 238));
		l15.setBounds(300,320,2000,30);
		add(l15);
		
		JLabel l17=new JLabel("Login ");
		l17.setFont(new Font("Arial",Font.BOLD,30));
		l17.setForeground(new Color(238, 238, 238));
		l17.setBounds(300,370,2000,30);
		add(l17);
		
		JLabel l178=new JLabel("Contact us on -   Airlinereservationsystem1245@gmail.com ");
		l178.setFont(new Font("Arial",Font.BOLD,30));
		l178.setForeground(new Color(96, 139, 193));
		l178.setBounds(300,450,2000,40);
		add(l178);
		
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
	new Contact();
}}