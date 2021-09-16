package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Search_Employee implements ActionListener {
	JFrame f;
	JTextField t;
	JLabel l,l1,back;
	JButton b,b1;
	Search_Employee(){
		f=new JFrame("Search");
		f.setBackground(Color.GREEN);
		f.setLayout(null);
		
		l1=new JLabel();
		l1.setBounds(0,0,700,470);
		l1.setLayout(null);
		ImageIcon img=new ImageIcon("C:\\Users\\HP\\Downloads\\philipp-katzenberger-iIJrUoeRoCQ-unsplash.jpg");
		l1.setIcon(img);
		
		l=new JLabel("Employee ID");
		l.setVisible(true);
		l.setBounds(50,50,300,30);
		l.setForeground(Color.GREEN);
		l.setFont(new Font("serif",Font.BOLD,25));
		l1.add(l);
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(240,50,220,30);
		l1.add(t);
		
		b=new JButton("Search");
		b.setBounds(240,150,100,30);
		b.setForeground(Color.DARK_GRAY);
		b.addActionListener(this);
		l1.add(b);
		
		b1=new JButton("Cancel");
		b1.setBounds(360,150,100,30);
		b1.setForeground(Color.DARK_GRAY);
		b1.addActionListener(this);
		l1.add(b1);
		
		f.setSize(500,470);
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
		  new Update_Employee(t.getText());
		  f.setVisible(false);
	  }
  }
  public static void main(String args[]) {
	  new Search_Employee();
  }
}
