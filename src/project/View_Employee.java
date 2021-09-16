package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View_Employee implements ActionListener {
	JFrame f;
	JTextField t;
	JButton b,b1;
	JLabel l1,l2;
	View_Employee(){
		
		f=new JFrame("View");
		f.setBackground(Color.GREEN);
		f.setLayout(null);
		
		l1=new JLabel();
		l1.setBounds(0,0,500,270);
		l1.setLayout(null);
		ImageIcon img=new ImageIcon("C:\\Users\\HP\\Downloads\\Employee-Management-System-master\\Employee-Management-System-master\\Employee-Management-System\\src\\Employeee\\icons\\view.jpg");
		l1.setIcon(img);
		
		l2=new JLabel("Employee id");
		l2.setVisible(true);
		l2.setBounds(40,60,250,30);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("serif",Font.BOLD,25));
		l1.add(l2);
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(240,60,220,30);
		l1.add(t);
		
		b=new JButton("Search");
		b.setBounds(240,150,100,30);
        b.addActionListener(this);
        l1.add(b);
        
        b1=new JButton("Cancel");
        b1.setBounds(360,150,100,30);
        b1.addActionListener(this);
        l1.add(b1);
        
        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);	
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			f.setVisible(false);
			Details d=new Details();
		}
		if(ae.getSource()==b) {
			f.setVisible(false);
			Print_Employee p=new Print_Employee(t.getText());
		}
	}
	public static void main(String args[]) {
		View_Employee v=new View_Employee();
	}
	
	

}
