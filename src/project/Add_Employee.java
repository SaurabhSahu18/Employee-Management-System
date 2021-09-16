package project;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Add_Employee implements ActionListener{
	JFrame f;
	JComboBox gen;
	JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1,id16,id13;
	JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	JButton b,b1,b2,b3;
	Add_Employee(){
		String []gender= {"Male","Female","other"};
		f=new JFrame("Add employee");
		f.setBackground(Color.WHITE);
		f.setLayout(null);
		
		id15=new JLabel();
		id15.setBounds(0,0,900,700);
		id15.setLayout(null);
		ImageIcon img=new ImageIcon("C:\\Users\\HP\\Downloads\\alesia-kazantceva-XLm6-fPwK5Q-unsplash.jpg");
		id15.setIcon(img);
		
		id8=new JLabel("New Employee Details");
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
		
		id13=new JLabel("Gender");
		id13.setBounds(400,400,150,30);
		id13.setFont(new Font("serif",Font.BOLD,20));
		id15.add(id13);
		
		gen=new JComboBox(gender);
	    gen.setBounds(600,400,150,30);
		id15.add(gen);
	
		
		lab=new JLabel();
		lab.setBounds(200,450,250,200);
		id15.add(lab);
		
		lab1=new JLabel("");
		lab1.setBounds(600,450,250,200);
		id15.add(lab1);
		
		b=new JButton("Submit");
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
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		String a=t1.getText();
		String bb=t2.getText();
		String c=t3.getText();
		String d=t4.getText();
		String e=t5.getText();
		String m=t6.getText();
		String g=t7.getText();
		String h=t8.getText();
		String i=t9.getText();
		String j=t10.getText();
		String k=t11.getText();
		String n=gen.getSelectedItem().toString();
		if(ae.getSource()==b) {
			try {
				Conn c2=new Conn();
				String w="insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+m+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+n+"')";
				c2.s.executeUpdate(w);
				JOptionPane.showMessageDialog(null,"Successfully Submited");
				f.setVisible(false);
				new Details();
			}catch(Exception ee) {
				System.out.println("error:"+ee);
			}
		}else if(ae.getSource()==b1) {
			f.setVisible(false);
			new Details();
		}
			
	}	
		

public static void main(String args[]) {
	new Add_Employee();
	
	
}
}


	// TODO Auto-generated method stub
	





