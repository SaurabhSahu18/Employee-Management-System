package project;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Salary_pay_slip extends JFrame implements ActionListener{
		Choice c1;
	    JTextArea t1,t2;
	    JButton b1,b2;

	    Salary_pay_slip(){
	        
	        setSize(1000,800);
	        setLocation(400,150);
	        c1 = new Choice();
	        try{
	            Conn c = new Conn();
	            ResultSet rs = c.s.executeQuery("select * from salary");
	            while(rs.next()){
	                c1.add(rs.getString("emp_id"));
	            }
	        }catch(Exception e) { }
	    
	        setLayout(new BorderLayout());
	        
	        JPanel p1 = new JPanel();
	        p1.add(new JLabel("Select Empolyee Id"));
	        p1.setFont(new Font("serif",Font.BOLD,20));
	        p1.add(c1);
	        add(p1,"North");
	    
	        t1 = new JTextArea(30,80);
	        JScrollPane jsp = new JScrollPane(t1);
	     
	        Font f1 = new Font("arial",Font.BOLD,20);
	        t1.setFont(f1);
	        
	        b1 = new JButton("Generate Pay Slip");
	    
	        add(b1,"South");
	        add(jsp,"Center");
	        b1.addActionListener(this);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	   
	    public void actionPerformed(ActionEvent e) {
	     
	        try{
	            Conn c = new Conn();
	         
	            ResultSet rs = c.s.executeQuery("select * from employee where emp_id="+c1.getSelectedItem());
	            rs.next();
	            String name = rs.getString("name");
	            rs.close();
	         
	            rs = c.s.executeQuery("select * from salary where emp_id="+c1.getSelectedItem());
	            double gross=0;
	            double net=0;
	 
	            java.util.Date d1 = new java.util.Date();
	            t1.setText(" ----------------   PAY SLIP FOR THE MONTH OF "+d1+" ------------------------");
	            t1.append("\n");
	  
	            if(rs.next()){
	          
	                t1.append("\n     Employee ID : "+rs.getString("emp_id"));
	                t1.append("\n     Employee Name : "+name);
	 
	                t1.append("\n----------------------------------------------------------------");
	                t1.append("\n");

	                double hra = rs.getDouble("hra");
	                t1.append("\n                  HRA         : "+hra);
	                double da  = rs.getDouble("da");
	                t1.append("\n                  DA          : "+da);
	                double med  = rs.getDouble("med");
	                t1.append("\n                  MED         : "+med);
	                double pf  = rs.getDouble("pf");
	                t1.append("\n                  PF          : "+pf);
	                double basic = rs.getDouble("basic_salary");
	                gross = hra+da+med+pf+basic;
	                net = gross - pf;
	                t1.append("\n                  BASIC SALARY : "+basic);

	                t1.append("\n-------------------------------------------------------");
	                t1.append("\n");
	 
	                t1.append("\n       GROSS SALARY :"+gross+"    \n       NET SALARY : "+net);
	                t1.append("\n       Tax   :   2.1% of gross "+ (gross*2.1/100));   
	                t1.append("\n -------------------------------------------------");
	                t1.append("\n");
	                t1.append("\n");    
	                t1.append("\n");
	                t1.append("   (  Signature  )      ");

	            }
	        }catch(Exception ee) {
	            ee.printStackTrace();
	        }
	 
	   
	    }
	    public static void main(String[] args){
	        new Salary_pay_slip();
	    }
}



