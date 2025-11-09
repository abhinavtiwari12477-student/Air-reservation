import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fdetails extends JFrame{
	Fdetails(){
		setLayout(null);
		
		 getContentPane().setBackground(new Color(0, 0, 0));
		 
		 ImageIcon icon=new ImageIcon("C:\\Users\\Abhinav Tiwari\\Downloads\\a4.jpeg");
		JLabel image=new JLabel(icon);
		image.setBounds(400,220,650,800);
		add(image);
		
		JLabel label=new JLabel("FLIGHT DETAILS");
		label.setFont(new Font("Monospaced",Font.BOLD,40));
		label.setForeground(new Color(31, 125, 83));
		label.setBounds(550,20,4000,30);
		add(label);
		
		JLabel l1=new JLabel(  "flight id: FL 1001    |   IndiGo:6E 5239          |   12:50 pm--14:15 pm\n");
		l1.setForeground(new Color(92, 194, 242));
		l1.setFont(new Font("Arial",Font.ITALIC,30));
		l1.setBounds(300,70,4000,30);
		add(l1);
		JLabel l2=new JLabel(  "flight id: FL 1002    |   IndiGo:5E 5478          |   18:00 pm--20:50 pm\n");
		l2.setForeground(new Color(92, 194, 242));
		l2.setFont(new Font("Arial",Font.ITALIC,30));
		l2.setBounds(300,110,4000,30);
		add(l2);
		JLabel l32=new JLabel(  "flight id: FL 1003    |   IndiGo:6E 7296          |   17:00 pm--19:40 pm\n");
		l32.setForeground(new Color(92, 194, 242));
		l32.setFont(new Font("Arial",Font.ITALIC,30));
		l32.setBounds(300,150,4000,30);
		add(l32);
		JLabel l4=new JLabel(  "flight id: FL 1004    |   IndiGo:6E 6313          |   11:00 am--12:49 pm\n");
		l4.setForeground(new Color(92, 194, 242));
		l4.setFont(new Font("Arial",Font.ITALIC,30));
		l4.setBounds(300,190,4000,30);
		add(l4);
		JLabel l5=new JLabel(  "flight id: FL1005     |   IndiGo:5E 5032          |   09:30 am--11:00 am\n");
		l5.setForeground(new Color(92, 194, 242));
		l5.setFont(new Font("Arial",Font.ITALIC,30));
		l5.setBounds(300,230,4000,30);
	add(l5);
	
		JLabel l7=new JLabel(  "flight id: FL 1011    |   IndiGo:6E 5239          |   12:50 pm--14:15 pm\n");
		l7.setForeground(new Color(92, 194, 242));
		l7.setFont(new Font("Arial",Font.ITALIC,30));
		l7.setBounds(300,270,4000,30);
		add(l7);
		JLabel l8=new JLabel(  "flight id: FL 1022    |   IndiGo:5E 5478          |   18:00 pm--20:50 pm\n");
		l8.setForeground(new Color(92, 194, 242));
		l8.setFont(new Font("Arial",Font.ITALIC,30));
		l8.setBounds(300,310,4000,30);
		add(l8);
		JLabel l9=new JLabel(  "flight id: FL 1033    |   IndiGo:6E 7296          |   17:00 pm--19:40 pm\n");
		l9.setForeground(new Color(92, 194, 242));
		l9.setFont(new Font("Arial",Font.ITALIC,30));
		l9.setBounds(300,350,4000,30);
		add(l9);
		JLabel l10=new JLabel(  "flight id: FL 1044    |   IndiGo:6E 6313          |   11:00 am--12:49 pm\n");
		l10.setForeground(new Color(92, 194, 242));
		l10.setFont(new Font("Arial",Font.ITALIC,30));
		l10.setBounds(300,390,4000,30);
		add(l10);
		JLabel l11=new JLabel(  "flight id: FL 1055    |   IndiGo:5E 5032          |   09:30 am--11:00 am\n  more....");
		l11.setForeground(new Color(92, 194, 242));
		l11.setFont(new Font("Arial",Font.ITALIC,30));
		l11.setBounds(300,430,4000,30);
	add(l11);
	
	
	JButton button=new JButton("Back ");
	button.setBackground(new Color(126, 142, 241));
	button.setForeground(Color.WHITE);
	button.setBounds(700,500,80,20);
	add(button);
	
	button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			dispose();
			new Home();
		}
	});
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public static void main(String args[]){
			new Fdetails();
		
	}
}