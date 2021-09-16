package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Details implements ActionListener {
	JFrame f;
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	Details(){
		f=new JFrame("Employee Details");
		f.setBackground(Color.WHITE);
		f.setLayout(null);
		l1=new JLabel();
		l1.setBounds(0,0,1400,800);
		f.add(l1);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		ImageIcon i1=new ImageIcon("C:\\Users\\HP\\Downloads\\justin-eisner-ZOG7Zj7cfR8-unsplash.jpg");
		l1.setIcon(i1);
		f.add(l1);
		
		l2=new JLabel("Employee Details");
		l2.setBounds(630,20,1500,100);
		l2.setFont(new Font("serif",Font.BOLD,70));
		l2.setForeground(Color.BLACK);
		l1.add(l2);
		
		b1=new JButton("ADD");
		b1.setBounds(650,120,150,40);
		b1.setFont(new Font("serif",Font.BOLD,15));
		b1.addActionListener(this);
		l1.add(b1);
		
		b2=new JButton("VIEW");
		b2.setBounds(820,120,150,40);
		b2.setFont(new Font("serif",Font.BOLD,15));
		b2.addActionListener(this);
		l1.add(b2);
		
		b3=new JButton("REMOVE");
		b3.setBounds(650,180,150,40);
		b3.setFont(new Font("serif",Font.BOLD,15));
		b3.addActionListener(this);
		l1.add(b3);
		
		b4=new JButton("UPDATE");
		b4.setBounds(820,180,150,40);
		b4.setFont(new Font("serif",Font.BOLD,15));
		b4.addActionListener(this);
		l1.add(b4);
		
		b5=new JButton("Attendance");
		b5.setBounds(650,240,150,40);
		b5.setFont(new Font("serif",Font.BOLD,15));
		b5.addActionListener(this);
		l1.add(b5);
		
		b6=new JButton("Attend. details");
		b6.setBounds(820,240,150,40);
		b6.setFont(new Font("serif",Font.BOLD,15));
		b6.addActionListener(this);
		l1.add(b6);
		
		b7=new JButton("Salary");
		b7.setBounds(650,300,150,40);
		b7.setFont(new Font("serif",Font.BOLD,15));
		b7.addActionListener(this);
		l1.add(b7);
		
		b8=new JButton("Pay slip");
		b8.setBounds(820,300,150,40);
		b8.setFont(new Font("salary",Font.BOLD,15));
		b8.addActionListener(this);
		l1.add(b8);
		
		
		
		f.setVisible(true);
		f.setSize(1400,800);
		f.setLocation(200,100);
		f.setResizable(false);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			f.setVisible(false);
			new Add_Employee();
		}
		if(ae.getSource()==b2) {
			f.setVisible(false);
			new View_Employee();
		}
		if(ae.getSource()==b3) {
			f.setVisible(false);
			new Remove_Employee();
		}
		if(ae.getSource()==b4) {
			f.setVisible(false);
			new Search_Employee();
		}
		if(ae.getSource()==b5) {
			f.setVisible(false);
			new Attendence_of_employee();
		}
		if(ae.getSource()==b6) {
			f.setVisible(false);
			new Attendence_detail();
		}
		if(ae.getSource()==b7) {
			f.setVisible(false);
			new Salary_Employee();
			
		}
		if(ae.getSource()==b8) {
			f.setVisible(false);
			new Salary_pay_slip();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details d=new Details();

	}

}
