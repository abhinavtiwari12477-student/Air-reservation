import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


class Booking extends JFrame {
	String flightId;
	String rupees;
	String from;
	String to;
	JLabel lbl5;
	
    Booking() {
        
        setLayout(null);
		
		ImageIcon icon=new ImageIcon("C:\\Users\\Abhinav Tiwari\\OneDrive\\Pictures\\rm1.jpg");
		JLabel image=new JLabel(icon);
		image.setBounds(0,0,1600,800);
		add(image);
	
		
				JLabel label=new JLabel("BOOK  FLIGHT");
			label.setFont(new Font("Monospaced",Font.ITALIC,50));
		label.setForeground(Color.WHITE);
		label.setBounds(550 , 20 , 400 , 40);
		image.add(label);
		
			JLabel l1=new JLabel("Passengers name   ");
			l1.setFont(new Font("Arial",Font.ITALIC,25));
		l1.setForeground(Color.WHITE);
		l1.setBounds(20,100,400,40);
		image.add(l1);
		
			JLabel lbl=new JLabel("From ");
			lbl.setFont(new Font("Arial",Font.ITALIC,25));
		lbl.setForeground(Color.WHITE);
		lbl.setBounds(20,180,100,40);
		image.add(lbl);
			
			JLabel lbl1=new JLabel("  To ");
			lbl1.setFont(new Font("Arial",Font.ITALIC,25));
		lbl1.setForeground(Color.WHITE);
		lbl1.setBounds(350,180,100,40);
		image.add(lbl1);
		
				JLabel lbl5=new JLabel(" ");
			lbl5.setFont(new Font("Arial",Font.BOLD,25));
		lbl5.setForeground(Color.WHITE);
		lbl5.setBounds(20,500,1000,40);
		image.add(lbl5);
			
			JLabel lbl8=new JLabel("  ");
			lbl8.setFont(new Font("Arial",Font.BOLD,25));
		lbl8.setForeground(Color.WHITE);
		lbl8.setBounds(20,570,660,40);
		image.add(lbl8);
		
			JLabel lbl9=new JLabel("  ");
			lbl9.setFont(new Font("Arial",Font.BOLD,25));
		lbl9.setForeground(Color.WHITE);
		lbl9.setBounds(18,620,1000,40);
		image.add(lbl9);
		
			JTextField tf1=new JTextField();
				tf1.setFont(new Font("Arial",Font.ITALIC,22));
		tf1.setBounds(260,109,200,30);
		image.add(tf1);
		
		JTextField tf=new JTextField();
			tf.setFont(new Font("Arial",Font.ITALIC,22));
		tf.setBounds(100,185,200,30);
		image.add(tf);
		
			JTextField tf2=new JTextField();
				tf2.setFont(new Font("Arial",Font.ITALIC,22));
		tf2.setBounds(400,185,200,30);
		image.add(tf2);
		
		JRadioButton c1=new JRadioButton("One way");
			c1.setFont(new Font("Arial",Font.ITALIC,25));
			c1.setForeground(Color.WHITE);
			c1.setBackground(new Color(78, 113, 255));
		c1.setBounds(600, 100, 200, 30);
		image.add(c1);

	
		JRadioButton c2=new JRadioButton("Round Trip");
			c2.setFont(new Font("Arial",Font.ITALIC,25));
		c2.setBackground(new Color(78, 113, 255));
			c2.setForeground(Color.WHITE);
		c2.setBounds(800, 100, 200, 30);
		image.add(c2);
		
		JLabel lbl2=new JLabel("Flight Id : ");
			lbl2.setFont(new Font("Arial",Font.ITALIC,20));
		lbl2.setForeground(Color.WHITE);
		lbl2.setBounds(1050,100,500,40);
		image.add(lbl2);
		
		JButton button3=new JButton("Back");
		button3.setBounds(1100, 400, 200, 30);
		image.add(button3);
		
		
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				dispose();
				new Home();
				
			}
		});
		
		
		JButton button=new JButton("Check Flights");
		button.setBounds(500, 400, 200, 30);
		image.add(button);
		
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			String from=tf.getText();
			String to=tf2.getText();
			
			Random r1=new Random();
			 flightId=" FL "+(1000+r1.nextInt(1051));
			 rupees=" ₹ "+(4000+r1.nextInt(8000));
			
			lbl2.setText("Flight Id : "+flightId +"                 Amount :"+rupees);
			}
		});
		
			JButton button2=new JButton("Book Flights");
		button2.setBounds(800, 400, 200, 30);
		image.add(button2);
		
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String pn=tf1.getText();
			String from=tf.getText();
			String to=tf2.getText();
			
			
			
			JOptionPane.showMessageDialog(null ,
			"   Booking Successful \n  "+
			"Flight Id : " + flightId + "\n" +
			"    Amount : " + rupees +"\n"+
			"  From :  " + from+ "\n" +
			"  To : " + to);
			
			lbl5.setText("BOOKING SUCCESSFULL  ");
			lbl8.setText("Passenger Name : "+pn);
			lbl9.setText("Flight Id : "+ flightId + "         Amount : "+rupees+" "+"|   From : " +  from+  "  | To : " + to);
			}
		});
		
		

		setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        
       new Booking();
    }
}