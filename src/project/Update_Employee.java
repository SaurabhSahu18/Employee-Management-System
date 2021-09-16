package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Update_Employee implements ActionListener {
	
	JFrame f;
	JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1;
	JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton b,b1,b2,b3;
	String id_emp;
	Update_Employee(String idaa){
		f=new JFrame("Update Employee");
		f.setBackground(Color.WHITE);
		f.setLayout(null);
		
		id_emp=idaa;
		id15=new JLabel();
		id15.setBounds(0,0,900,700);
		id15.setLayout(null);
		ImageIcon img=new ImageIcon("C:\\Users\\HP\\Downloads\\andrew-neel-cckf4TsHAuw-unsplash.jpg");
		id15.setIcon(img);
		
		id8=new JLabel("Update Employee Details");
		id8.setBounds(320,30,500,50);
		id8.setFont(new Font("serif",Font.BOLD,30));
		id8.setForeground(Color.BLACK);
		id15.add(id8);
		f.add(id15);
		
		id1=new JLabel("Name");
		id1.setBounds(50,150,100,30);
		id1.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id1);
		
		t1=new JTextField();
		t1.setBounds(200,150,150,30);
		id15.add(t1);
		
		id2=new JLabel("Father's Name");
		id2.setBounds(400,150,200,30);
		id2.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id2);
		
		t2=new JTextField();
		t2.setBounds(600,150,150,30);
		id15.add(t2);
		
		id3=new JLabel("Age");
		id3.setBounds(50,200,100,30);
		id3.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id3);
		
		t3=new JTextField();
		t3.setBounds(200,200,150,30);
		id15.add(t3);
		
		id4=new JLabel("Date of Birth");
		id4.setBounds(400,200,200,30);
		id4.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id4);
		
		t4=new JTextField();
		t4.setBounds(600,200,150,30);
		id15.add(t4);
		
		id5=new JLabel("Address");
		id5.setBounds(50,300,100,30);
		id5.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id5);
		
		t5=new JTextField();
		t5.setBounds(200,300,150,30);
		id15.add(t5);
		
		
		id6=new JLabel("Phone");
		id6.setBounds(400,250,100,30);
		id6.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id6);
		
		t6=new JTextField();
		t6.setBounds(600,250,150,30);
		id15.add(t6);
		
		
		id7=new JLabel("Email id");
		id7.setBounds(50,250,100,30);
		id7.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id7);
		
		t7=new JTextField();
		t7.setBounds(200,250,150,30);
		id15.add(t7);
		
		
		
		id9=new JLabel("Education");
		id9.setBounds(400,300,100,30);
		id9.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id9);
		
		t8=new JTextField();
		t8.setBounds(600,300,150,30);
		id15.add(t8);
		
		
		
		id10=new JLabel("Job Post");
		id10.setBounds(50,350,100,30);
		id10.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id10);
		
		t9=new JTextField();
		t9.setBounds(200,350,150,30);
		id15.add(t9);
		
		
		id11=new JLabel("Aadhar no.");
		id11.setBounds(400,350,150,30);
		id11.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id11);
		
		t10=new JTextField();
		t10.setBounds(600,350,150,30);
		id15.add(t10);
		
		
		id12=new JLabel("Employee id");
		id12.setBounds(50,400,100,30);
		id12.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id12);
		
		t11=new JTextField();
		t11.setBounds(200,400,150,30);
		id15.add(t11);
		
		lab=new JLabel();
		lab.setBounds(200,450,250,200);
		id15.add(lab);
		
		lab1=new JLabel("");
		lab1.setBounds(600,450,250,200);
		id15.add(lab1);
		
		b=new JButton("Update");
		b.setBackground(Color.WHITE);
		b.setForeground(Color.BLACK);
		b.setBounds(250,550,140,40);
		id15.add(b);
		
		b1=new JButton("cancel");
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setBounds(450,550,150,40);
		id15.add(b1);
		b.addActionListener(this);
		b1.addActionListener(this);
		f.setVisible(true);
		f.setSize(900,700);
		f.setLocation(400,150);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		showData(idaa);
		
}
	int i=0;
	 void showData(String s) {
		 try {
			 Conn c5=new Conn();
			 String str="select * from employee where emp_id='"+s+"'";
			 ResultSet rs=c5.s.executeQuery(str);
			 if(rs.next()) {
				 f.setVisible(true);
				 i=1;
				 
				 t1.setText(rs.getString(1));
				 t2.setText(rs.getString(2));
				 t3.setText(rs.getString(3)); 
				 t4.setText(rs.getString(4));
				 t5.setText(rs.getString(5));
				 t6.setText(rs.getString(6));
				 t7.setText(rs.getString(7));
				 t8.setText(rs.getString(8));
				 t9.setText(rs.getString(9));
				 t10.setText(rs.getString(10));
				 t11.setText(rs.getString(11));
 }
			 if(i==0)
				 JOptionPane.showMessageDialog(null,"id not found");
			 new Search_Employee();	 
		 }catch(Exception ex) {}
		 f.setVisible(true);
	 }
	public void actionPerformed(ActionEvent se) {
		if(se.getSource()==b && i==1) {
			try {
				Conn c5=new Conn();
				String str="update employee set name='"+t1.getText()+"',father_name='"+t2.getText()+"',age='"+t3.getText()+"',dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',education='"+t8.getText()+"',post='"+t9.getText()+"',aadhar='"+t10.getText()+"',emp_id='"+t11.getText()+"'";
				c5.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null,"Update");
				f.setVisible(false);
				Search_Employee s=new Search_Employee();
			}catch(Exception e) {
				System.out.println("error:"+e);
			}
		}
		if(se.getSource()==b1) {
			f.setVisible(false);
			Details d=new Details();
		}
		
	}
	public static void main(String args[]) {
		new Update_Employee("Update");
	}
	
	
}
