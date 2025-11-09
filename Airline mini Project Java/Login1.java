import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame{
	Login(){
		setLayout(null);
		
			ImageIcon icon=new ImageIcon("C:\\Users\\Abhinav Tiwari\\Downloads\\ChatGPT Image Aug 17, 2025, 09_41_41 PM.png");
		JLabel image=new JLabel(icon);
	
		image.setBounds( 0 , 0 , 1600 ,800);
		
		add(image);
		getContentPane().setBackground(Color.BLACK);
		
		
		
		JLabel label1=new JLabel("Enter your login details ");
			label1.setFont(new Font("Arial",Font.ITALIC,40));
		label1.setForeground(new Color(193, 234, 242));
		label1.setBounds(590 ,120 , 500 , 45);
		image.add(label1);
		
		//1
		JLabel label=new JLabel("Username");
			label.setFont(new Font("Arial",Font.BOLD,40));
		label.setForeground(Color.WHITE);
		label.setBounds(550 ,250 , 500 , 40);
		image.add(label);
		
		//2
		JLabel lbl=new JLabel("Password ");
			lbl.setFont(new Font("Arial",Font.BOLD,40));
		lbl.setForeground(Color.WHITE);
		lbl.setBounds(550,320,500,40);
		image.add(lbl);
		
		//3
		JTextField tf=new JTextField();
		tf.setFont(new Font("Arial",Font.ITALIC,30));
		tf.setBounds(840,250,290,30);
		image.add(tf);
		
		//4
		JPasswordField tf2=new JPasswordField();
			tf2.setFont(new Font("Arial",Font.ITALIC,30));
		tf2.setBounds(840,320,290,30);
		image.add(tf2);
		
		//5
		JButton button=new JButton("Login");
		button.setBounds(700,500,140,20);
		image.add(button);
		
	
		button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			String Username=tf.getText();
			String Password=new String(tf2.getPassword());
			
			if(Username.equals("Abhinav")&&Password.equals("1234")){
				dispose();
				new Home();
			}else {
			JOptionPane.showMessageDialog(null," can not  login  ");}
			}
			}
			);
		
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Login page");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		new Login();
	}

}