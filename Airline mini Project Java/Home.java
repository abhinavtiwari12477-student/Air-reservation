import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Home extends JFrame{
	Home(){
		setLayout(null);
		
		ImageIcon icon=new ImageIcon("C:\\Users\\Abhinav Tiwari\\Downloads\\ChatGPT Image Aug 14, 2025, 11_46_41 AM.png");
		JLabel image=new JLabel(icon);
		image.setBounds(0,0,1600,800);
		add(image);
		
				JLabel label=new JLabel(" AIRLINE RESERVATION SYSTEM  ");
		label.setBounds(50 , 50 , 900 , 40);
		label.setFont(new Font("Arial",Font.BOLD,50));
		label.setForeground(new Color(193, 234, 242));
		image.add(label);
		
		
			JLabel label2=new JLabel(" DISCOVER THE WORLD ");
		label2.setBounds(600 , 350 , 900 , 40);
		label2.setFont(new Font("Arial",Font.ITALIC,40));
		label2.setForeground(new Color(247, 243, 243));
		image.add(label2);
		
			JLabel label4=new JLabel( "Wishing you a safe and smooth journey! May your flight be filled with comfort  and joy, ");
		label4.setBounds(450 , 450 , 900 , 30);
		label4.setFont(new Font("Arial",Font.ITALIC,20));
		label4.setForeground(new Color(92, 194, 242));
		image.add(label4);
		
				JLabel label5=new JLabel( "and may you arrive at your destination with ease ");
		label5.setBounds(590 , 500 , 900 , 30);
		label5.setFont(new Font("Arial",Font.ITALIC,20));
		label5.setForeground(new Color(92, 194, 242));
		image.add(label5);
		
		
		JMenuBar mb=new JMenuBar();
		mb.setPreferredSize(new Dimension(0,40));  //used for the dimension of menubar
		mb.setBackground(Color.BLACK);
		mb.setOpaque(true);
		setJMenuBar(mb);
		
		getContentPane().setBackground(Color.BLACK);
		
		JMenu details=new JMenu(" Details ");
		details.setFont(new Font("Arial",Font.BOLD,25));
		details.setForeground(new Color(0, 187, 240));
		mb.add(details);
		
		JMenu about=new JMenu("   About");
		
		about.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			dispose();
			new About();
		}
	});
		about.setFont(new Font("Arial",Font.BOLD,25));
		about.setForeground(new Color(0, 187, 240));
		mb.add(about);
		
		JMenuItem flightdetails=new JMenuItem("FLIGHT DETAILS ✈");
		flightdetails.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			dispose();
			new Fdetails();
		}
	});
		
		details.add(flightdetails);
		
				JMenuItem Booking=new JMenuItem("BOOK FLIGHTS ✈");
				Booking.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			dispose();
			new Booking();
		}
	});
		details.add(Booking);
		
				JMenuItem customercare=new JMenuItem("CUSTOMER CARE");
				customercare.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			dispose();
			new Contact();
		}
	});
		details.add(customercare);
		
		
		
		
	setExtendedState(JFrame.MAXIMIZED_BOTH);
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		new Home();
	}

}