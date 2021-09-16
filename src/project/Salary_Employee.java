package project;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Salary_Employee extends JFrame  implements ActionListener{
	JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2;
    
    Salary_Employee(){
        super("Set Salary");
        
       
        setLayout(new GridLayout(8,2,20,20));
        c2 = new Choice();
        c2.setFont(new Font("serif",Font.BOLD,20));
       
        try{
           Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
      
            while(rs.next()){
                c2.add(rs.getString("emp_id"));    
            }
        }catch(Exception e){ }
       
        add(new JLabel("Select Employee.id"));
        add(c2);
        
        l1 = new JLabel("House Rent allowance(HRA)");
        t1 = new JTextField(15);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        add(t1);
       
        l3 = new JLabel("Dearness Allowance(DA)");
        t3 = new JTextField(15);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        add(t3);
        
        l4 = new JLabel("Medical Allowance(MED)");
        t4 = new JTextField(15);
        l4.setFont(new Font("serif",Font.BOLD,20));
        add(l4);
        add(t4); 
       
        l5 = new JLabel("Provident Fund(PF)");
        t5 = new JTextField(15);
        l5.setFont(new Font("serif",Font.BOLD,20));
        add(l5);
        add(t5);
        
        l6 = new JLabel("Basic Salary");
        t6 = new JTextField(15);
        l6.setFont(new Font("serif",Font.BOLD,20));
        add(l6);
        add(t6);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        add(b1);
        add(b2);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        setSize(650,750);
        setLocation(500,200);
        setVisible(true);
       
        
        getContentPane().setBackground(Color.WHITE);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String hra = t1.getText();
        String emp_id = c2.getSelectedItem();
        String da = t3.getText();
        String med = t4.getText();
        String pf = t5.getText();
        String basic = t6.getText();
        String qry = "insert into salary values("+ emp_id +","+hra+","+da+","+med+","+pf+","+basic+")";
        if(ae.getSource()==b1) {
        try{
            Conn c1 = new Conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Salary updated");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }else if(ae.getSource()==b2) {
    	setVisible(false);
    	new Details();
    }
   }
    public static void main(String[] args){
        new Salary_Employee();
  }
}
