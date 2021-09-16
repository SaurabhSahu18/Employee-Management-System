package project;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.*;

class Front_page implements ActionListener {
	JFrame f;
	JLabel id,l1;
	JButton b;
	Front_page(){
		f=new JFrame("Employee Management System");
		f.setBackground(Color.BLACK);
		f.setLayout(null);
		ImageIcon i1=new ImageIcon("C:\\Users\\HP\\Downloads\\annie-spratt-QckxruozjRg-unsplash.jpg");
		Image i2=i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(0,150,1400,600);
		f.add(l1);
		
		b=new JButton("click here to continue");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		
		b.setBounds(500,600,300,70);
		b.addActionListener(this);
		id=new JLabel();
		id.setBounds(0,0,1360,750);
		id.setLayout(null);
		JLabel lid=new JLabel("Employee Management System");
		lid.setBounds(130,30,1500,100);
		lid.setFont(new Font("serif",Font.PLAIN,70));
		lid.setForeground(Color.YELLOW);
		id.add(lid);
		id.add(b);
		f.add(id);
		f.getContentPane().setBackground(Color.BLACK);
		f.setVisible(true);
		f.setSize(1360,750);
		f.setLocation(200,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(false);
		while(true)
		{
			lid.setVisible(false);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
			lid.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b) {
			f.setVisible(false);
			Login2 l=new Login2();
		}
		
	}
	public static void main(String args[])
	{
		Front_page f=new Front_page();
	}
}
	