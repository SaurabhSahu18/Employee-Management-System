package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.Image;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login2 implements ActionListener{
	JFrame f;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	Login2(){
		f=new JFrame("Login");
		f.setBackground(Color.BLACK);
		f.setLayout(null);
		l1=new JLabel("Username");
		l1.setFont(new Font("serif",Font.BOLD,20));
		l1.setBounds(40,20,100,30);
		f.add(l1);
		l2=new JLabel("Password");
		l2.setBounds(40,70,100,30);
		l2.setFont(new Font("serif",Font.BOLD,20));
		f.add(l2);
		t1=new JTextField();
		t1.setBounds(150,20,150,30);
		f.add(t1);
		t2=new JPasswordField();
		t2.setBounds(150,70,150,30);
		f.add(t2);
		ImageIcon i1=new ImageIcon("C:\\Users\\HP\\Downloads\\Employee-Management-System-master\\Employee-Management-System-master\\Employee-Management-System\\src\\Employeee\\icons\\login.jpg");
		Image i2=i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3=new JLabel(i3);
		l3.setBounds(350,20,150,150);
		f.add(l3);
		
		b1=new JButton("Login");
		b1.setBounds(40,140,120,30);
		b1.setFont(new Font("serif",Font.BOLD,15));
		b1.addActionListener(this);
	    b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.WHITE);
	    f.add(b1);
	    b2=new JButton("Cancel");
	    b2.setBounds(180,140,120,30);
	    b2.setFont(new Font("serif",Font.BOLD,15));
	    b2.setBackground(Color.BLACK);
	    b2.setForeground(Color.WHITE);
	    f.add(b2);
	    b2.addActionListener(this);
	    f.getContentPane().setBackground(Color.WHITE);
	    f.setVisible(true);
	    f.setSize(600,300);
	    f.setLocation(400,300);
	    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	    f.setResizable(false);
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			Conn c1=new Conn();
			String u=t1.getText();
			String v=t2.getText();
			String q="select * from loginform where Username='"+u+"' and Password='"+v+"'";
			ResultSet rs=c1.s.executeQuery(q);
			if(rs.next()) {
				new Details().f.setVisible(true);
				f.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "Invalid Userid,Password");
				f.setVisible(false);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		Login2 l=new Login2();
	}
	    
	    
}
