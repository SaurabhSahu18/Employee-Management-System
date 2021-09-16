package project;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class Remove_Employee implements ActionListener{
	JFrame f;
	JTextField t;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JButton b1,b2,b3,b4;
	Remove_Employee(){
		f=new JFrame("Remove Employee");
		f.setBackground(Color.GREEN);
		f.setLayout(null);
		
		l5=new JLabel();
		l5.setBounds(0,0,900,900);
		l5.setLayout(null);
		ImageIcon img=new ImageIcon("C:\\Users\\HP\\Downloads\\scott-graham-5fNmWej4tAA-unsplash.jpg");
		l5.setIcon(img);
		f.add(l5);
		
		l1=new JLabel("Employee id");
		l1.setBounds(50,50,250,30);
		l1.setFont(new Font("serif",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		l5.add(l1);
		
		t=new JTextField();
		t.setBounds(250,50,150,30);
		l5.add(t);
		

		b1=new JButton("Search");
		b1.setBounds(200,100,100,30);
		b1.addActionListener(this);
		l5.add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(360,100,100,30);
		b2.addActionListener(this);
		l5.add(b2);
		
		l2=new  JLabel("Name:");
		l2.setBounds(50,150,250,30);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l2);
		
		
		
		l6=new  JLabel();
		l6.setBounds(200,150,350,30);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l6);
		
		l3=new  JLabel("Mobile:");
		l3.setBounds(50,200,250,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l3);
		
		l7=new  JLabel();
		l7.setBounds(200,200,350,30);
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l7);
		
		l4=new  JLabel("Email id:");
		l4.setBounds(50,250,250,30);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l4);
		
		l8=new  JLabel();
		l8.setBounds(200,250,350,30);
		l8.setForeground(Color.WHITE);
		l8.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l8);
		
		l9=new JLabel("Aadhar:");
		l9.setBounds(50,300,250,30);
		l9.setForeground(Color.WHITE);
		l9.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l9);
		
		l10=new  JLabel();
		l10.setBounds(200,300,350,30);
		l10.setForeground(Color.WHITE);
		l10.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l10);
		
		l11=new JLabel("Job Post");
		l11.setBounds(50,350,250,30);
		l11.setForeground(Color.WHITE);
		l11.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l11);
		
		l12=new JLabel();
		l12.setBounds(200,350,250,30);
		l12.setForeground(Color.WHITE);
		l12.setFont(new Font("serif",Font.BOLD,25));
		l5.add(l12);
		
		
		b3=new  JButton("Remove");
		b3.setBounds(120,500,100,30);
		b3.addActionListener(this);
		l5.add(b3);
		
		b4=new  JButton("Cancel");
		b4.setBounds(300,500,100,30);
		b4.addActionListener(this);
		l5.add(b4);
		
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		l4.setVisible(false);
		l9.setVisible(false);
		l11.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		
		f.setSize(700,700);
		f.setLocation(450,150);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			try {
				Conn c5=new Conn();
				String str="select name,phone,email,aadhar,post from employee where emp_id='"+t.getText()+"'";
				ResultSet rs=c5.s.executeQuery(str);
				int i=0;
				if(rs.next()) {
					String name=rs.getString(1);
					String mob=rs.getString(2);
					String email=rs.getString(3);
					String aadhar=rs.getString(4);
					String post=rs.getString(5);
					
					l2.setVisible(true);
					l3.setVisible(true);
					l4.setVisible(true);
					l9.setVisible(true);
					l11.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					
					i=1;
					l6.setText(name);
					l7.setText(mob);
					l8.setText(email);
					l10.setText(aadhar);
					l12.setText(post);
					
				}
				if(i==0)
					JOptionPane.showMessageDialog(null,"id not found");
			}catch(Exception ex) {}
		}
		if(ae.getSource()==b3) {
			try {
				Conn c5=new Conn();
				String str="delete from employee where emp_id='"+t.getText()+"'";
				c5.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null,"deleted success");
				l2.setVisible(false);
				l3.setVisible(false);
				l4.setVisible(false);
				l6.setVisible(false);
				l7.setVisible(false);
				l8.setVisible(false);
				l10.setVisible(false);
				b3.setVisible(false);
				b4.setVisible(false);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"excetion occured"+ex);
			}
		}
		if(ae.getSource()==b4) {
			f.setVisible(false);
			Details d=new Details();
		}
		if(ae.getSource()==b2) {
			f.setVisible(false);
		}
	}
   public static void main(String args[]) {
	   new Remove_Employee();
   }
	
	

}
